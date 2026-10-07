package one.me.sdk.concurrent;

import defpackage.e05;
import defpackage.f69;
import defpackage.ore;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.locks.LockSupport;
import java.util.function.Consumer;
import java.util.function.Predicate;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes3.dex */
public class LinkedTransferQueue34<E> extends AbstractQueue<E> implements TransferQueue<E>, Serializable {
    private static final int ASYNC = 1;
    private static final VarHandle HEAD;
    static final VarHandle ITEM;
    private static final int MAX_HOPS = 8;
    static final VarHandle NEXT;
    private static final int NOW = 0;
    static final long SPIN_FOR_TIMEOUT_THRESHOLD = 1023;
    static final int SWEEP_THRESHOLD = 32;
    private static final int SYNC = 2;
    private static final VarHandle TAIL;
    private static final int TIMED = 3;
    static final VarHandle WAITER;
    private static final long serialVersionUID = -3223113410248163686L;
    volatile transient Node head;
    private volatile transient boolean needSweep;
    private volatile transient Node tail;

    static {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            HEAD = lookup.findVarHandle(LinkedTransferQueue34.class, "head", Node.class);
            TAIL = lookup.findVarHandle(LinkedTransferQueue34.class, "tail", Node.class);
            ITEM = lookup.findVarHandle(Node.class, DatabaseHelper.ITEM_COLUMN_NAME, Object.class);
            NEXT = lookup.findVarHandle(Node.class, "next", Node.class);
            WAITER = lookup.findVarHandle(Node.class, "waiter", Thread.class);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public LinkedTransferQueue34(Collection<? extends E> collection) {
        Node node = null;
        Node node2 = null;
        for (E e : collection) {
            Objects.requireNonNull(e);
            Node node3 = new Node(e);
            if (node == null) {
                node = node3;
            } else {
                node2.appendRelaxed(node3);
            }
            node2 = node3;
        }
        if (node == null) {
            node = new Node();
            node2 = node;
        }
        this.head = node;
        this.tail = node2;
    }

    private E awaitMatch(Node node, Node node2, E e, boolean z, long j) {
        E e2;
        boolean z2 = node.isData;
        long jNanoTime = z ? System.nanoTime() + j : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        byte b = -1;
        long jNanoTime2 = j;
        while (true) {
            e2 = (E) node.item;
            if (e2 != e) {
                break;
            }
            if (this.needSweep) {
                sweep();
            } else if ((z && jNanoTime2 <= 0) || threadCurrentThread.isInterrupted()) {
                if (node.casItem(e, e == null ? node : null)) {
                    unsplice(node2, node);
                    return e;
                }
            } else if (b > 0) {
                e2 = (E) node.item;
                if (e2 != e) {
                    break;
                }
                if (z) {
                    jNanoTime2 = jNanoTime - System.nanoTime();
                    if (jNanoTime2 > SPIN_FOR_TIMEOUT_THRESHOLD) {
                        LockSupport.parkNanos(this, jNanoTime2);
                    }
                } else {
                    LockSupport.setCurrentBlocker(this);
                    try {
                        ForkJoinPool.managedBlock(node);
                    } catch (InterruptedException unused) {
                    }
                    LockSupport.setCurrentBlocker(null);
                }
            } else if (node2 != null && node2.next == node) {
                if (b >= 0 || (node2.isData == z2 && !node2.isMatched())) {
                    node.waiter = threadCurrentThread;
                    b = 1;
                } else {
                    Thread.yield();
                    b = 0;
                }
            }
        }
        if (b == 1) {
            (void) WAITER.set(node, null);
        }
        if (!z2) {
            (void) ITEM.set(node, node);
        }
        return e2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0049  */
    /* JADX WARN: Code duplicated, block: B:42:0x004c A[SYNTHETIC] */
    private boolean bulkRemove(Predicate<? super E> predicate) {
        boolean z = false;
        loop0: while (true) {
            Node node = this.head;
            Node node2 = node;
            Node node3 = null;
            int i = 8;
            while (node != null) {
                Node node4 = node.next;
                Object obj = node.item;
                boolean z2 = obj != null && node.isData;
                if (!z2) {
                    if (!node.isData && obj == null) {
                        break loop0;
                    }
                } else if (predicate.test(obj)) {
                    if (node.tryMatch(obj, null)) {
                        z = true;
                    }
                    z2 = false;
                }
                if (z2 || node4 == null || (i = i - 1) == 0) {
                    if (node2 == node) {
                        if (z2) {
                            node3 = node;
                            i = 8;
                            node2 = node4;
                        }
                    } else if (tryCasSuccessor(node3, node2, node)) {
                        node2 = node;
                        if (z2) {
                            node3 = node;
                            i = 8;
                            node2 = node4;
                        }
                    } else {
                        node3 = node;
                        i = 8;
                        node2 = node4;
                    }
                } else if (node == node4) {
                }
                node = node4;
            }
            break loop0;
        }
        return z;
    }

    private boolean casHead(Node node, Node node2) {
        return (boolean) HEAD.compareAndSet(this, node, node2);
    }

    private boolean casTail(Node node, Node node2) {
        return (boolean) TAIL.compareAndSet(this, node, node2);
    }

    private int countOfMode(boolean z) {
        while (true) {
            Node node = this.head;
            int i = 0;
            while (node != null) {
                if (!node.isMatched()) {
                    if (node.isData != z) {
                        return 0;
                    }
                    i++;
                    if (i == Integer.MAX_VALUE) {
                        return i;
                    }
                }
                Node node2 = node.next;
                if (node != node2) {
                    node = node2;
                }
            }
            return i;
        }
    }

    public static /* synthetic */ boolean lambda$clear$2(Object obj) {
        return true;
    }

    public static /* synthetic */ boolean lambda$retainAll$1(Collection collection, Object obj) {
        return !collection.contains(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Node node = null;
        Node node2 = null;
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                break;
            }
            Node node3 = new Node(object);
            if (node == null) {
                node = node3;
            } else {
                node2.appendRelaxed(node3);
            }
            node2 = node3;
        }
        if (node == null) {
            node = new Node();
            node2 = node;
        }
        this.head = node;
        this.tail = node2;
    }

    private Node skipDeadNodes(Node node, Node node2, Node node3, Node node4) {
        if (node4 != null) {
            if (tryCasSuccessor(node, node2, node4) || (node != null && node.isMatched())) {
                return node3;
            }
        } else if (node2 != node3) {
            node4 = node3;
            if (tryCasSuccessor(node, node2, node4)) {
            }
            return node3;
        }
        return node;
    }

    private void skipDeadNodesNearHead(Node node, Node node2) {
        while (true) {
            Node node3 = node2.next;
            if (node3 == null) {
                break;
            }
            if (!node3.isMatched()) {
                node2 = node3;
                break;
            } else if (node2 == node3) {
                return;
            } else {
                node2 = node3;
            }
        }
        if (casHead(node, node2)) {
            node.selfLink();
        }
    }

    private void sweep() {
        this.needSweep = false;
        Node node = this.head;
        while (node != null) {
            Node node2 = node.next;
            if (node2 == null) {
                return;
            }
            if (node2.isMatched()) {
                Node node3 = node2.next;
                if (node3 == null) {
                    return;
                }
                if (node2 == node3) {
                    node = this.head;
                } else {
                    node.casNext(node2, node3);
                }
            } else {
                node = node2;
            }
        }
    }

    private Object[] toArrayInternal(Object[] objArr) {
        int i;
        Object[] objArrCopyOf = objArr;
        loop0: while (true) {
            Node node = this.head;
            i = 0;
            while (true) {
                if (node == null) {
                    break loop0;
                }
                Object obj = node.item;
                if (!node.isData) {
                    if (obj == null) {
                        break loop0;
                    }
                } else if (obj != null) {
                    if (objArrCopyOf == null) {
                        objArrCopyOf = new Object[4];
                    } else if (i == objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, (i + 4) * 2);
                    }
                    objArrCopyOf[i] = obj;
                    i++;
                }
                Node node2 = node.next;
                if (node == node2) {
                    break;
                }
                node = node2;
            }
        }
        if (objArrCopyOf == null) {
            return new Object[0];
        }
        if (objArr == null || i > objArr.length) {
            return i == objArrCopyOf.length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i);
        }
        if (objArr != objArrCopyOf) {
            System.arraycopy(objArrCopyOf, 0, objArr, 0, i);
        }
        if (i < objArr.length) {
            objArr[i] = null;
        }
        return objArr;
    }

    public boolean tryCasSuccessor(Node node, Node node2, Node node3) {
        if (node != null) {
            return node.casNext(node2, node3);
        }
        if (!casHead(node2, node3)) {
            return false;
        }
        node2.selfLink();
        return true;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeObject(null);
    }

    private E xfer(E e, boolean z, int i, long j) {
        Node node;
        Node node2;
        Node node3;
        if (z) {
            e.getClass();
        }
        Node node4 = null;
        Node node5 = null;
        Node node6 = null;
        while (true) {
            Node node7 = this.tail;
            if (node4 == node7 || node7.isData != z) {
                node = this.head;
                node2 = node;
            } else {
                node2 = node5;
                node = node7;
            }
            do {
                node3 = node;
                while (true) {
                    if (node3.isData != z) {
                        E e2 = (E) node3.item;
                        if (z == (e2 == null)) {
                            if (node2 == null) {
                                node2 = this.head;
                            }
                            if (node3.tryMatch(e2, e)) {
                                if (node2 != node3) {
                                    skipDeadNodesNearHead(node2, node3);
                                }
                                return e2;
                            }
                        }
                    }
                    node = node3.next;
                    if (node == null) {
                        if (i != 0) {
                            if (node6 == null) {
                                node6 = new Node(e);
                            }
                            if (node3.casNext(null, node6)) {
                                if (node3 != node7) {
                                    casTail(node7, node6);
                                }
                                if (i != 1) {
                                    return awaitMatch(node6, node3, e, i == 3, j);
                                }
                            }
                        }
                        return e;
                    }
                }
                break;
            } while (node3 != node);
            node5 = node2;
            node4 = node7;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean add(E e) {
        xfer(e, true, 1, 0L);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        bulkRemove(new e05(12));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        loop0: while (true) {
            Node node = this.head;
            Node nodeSkipDeadNodes = null;
            while (node != null) {
                Node node2 = node.next;
                Object obj2 = node.item;
                boolean z = node.isData;
                if (obj2 == null) {
                    if (!z) {
                        break loop0;
                    }
                } else {
                    if (z) {
                        if (obj.equals(obj2)) {
                            return true;
                        }
                        nodeSkipDeadNodes = node;
                    }
                    node = node2;
                }
                Node node3 = node;
                while (true) {
                    if (node2 == null || !node2.isMatched()) {
                        nodeSkipDeadNodes = skipDeadNodes(nodeSkipDeadNodes, node, node3, node2);
                        node = node2;
                    } else if (node3 != node2) {
                        node3 = node2;
                        node2 = node2.next;
                    }
                }
            }
            break loop0;
        }
        return false;
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i) {
        Objects.requireNonNull(collection);
        int i2 = 0;
        if (collection == this) {
            ore.a();
            return 0;
        }
        while (i2 < i) {
            E ePoll = poll();
            if (ePoll == null) {
                break;
            }
            collection.add(ePoll);
            i2++;
        }
        return i2;
    }

    public final Node firstDataNode() {
        Node node;
        Node node2;
        Node node3;
        loop0: while (true) {
            node = this.head;
            node2 = node;
            while (true) {
                if (node2 != null) {
                    Object obj = node2.item;
                    boolean z = node2.isData;
                    if (obj != null) {
                        if (z) {
                            node3 = node2;
                            break loop0;
                        }
                    } else if (!z) {
                    }
                    Node node4 = node2.next;
                    if (node4 != null) {
                        if (node2 != node4) {
                            node2 = node4;
                        }
                    }
                }
                node3 = null;
                break loop0;
            }
        }
        if (node2 != node && casHead(node, node2)) {
            node.selfLink();
        }
        return node3;
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer<? super E> consumer) {
        Objects.requireNonNull(consumer);
        forEachFrom(consumer, this.head);
    }

    public void forEachFrom(Consumer<? super E> consumer, Node node) {
        while (true) {
            Node node2 = null;
            while (node != null) {
                Node node3 = node.next;
                defpackage.a aVar = (Object) node.item;
                boolean z = node.isData;
                if (aVar != null) {
                    if (z) {
                        consumer.accept(aVar);
                    }
                    node2 = node;
                    node = node3;
                } else if (!z) {
                    return;
                }
                Node node4 = node;
                while (true) {
                    if (node3 == null || !node3.isMatched()) {
                        node = skipDeadNodes(node2, node, node4, node3);
                        node2 = node;
                        node = node3;
                    } else if (node4 == node3) {
                        node = this.head;
                    } else {
                        node4 = node3;
                        node3 = node3.next;
                    }
                }
            }
            return;
        }
    }

    @Override // java.util.concurrent.TransferQueue
    public int getWaitingConsumerCount() {
        return countOfMode(false);
    }

    @Override // java.util.concurrent.TransferQueue
    public boolean hasWaitingConsumer() {
        while (true) {
            Node node = this.head;
            while (node != null) {
                Object obj = node.item;
                if (node.isData) {
                    if (obj != null) {
                        return false;
                    }
                } else if (obj == null) {
                    return true;
                }
                Node node2 = node.next;
                if (node != node2) {
                    node = node2;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return firstDataNode() == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new b(this);
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e, long j, TimeUnit timeUnit) {
        xfer(e, true, 1, 0L);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        while (true) {
            Node node = this.head;
            while (node != null) {
                E e = (E) node.item;
                if (node.isData) {
                    if (e != null) {
                        return e;
                    }
                } else if (e == null) {
                    return null;
                }
                Node node2 = node.next;
                if (node != node2) {
                    node = node2;
                }
            }
            return null;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        E eXfer = xfer(null, false, 3, timeUnit.toNanos(j));
        if (eXfer == null && Thread.interrupted()) {
            throw new InterruptedException();
        }
        return eXfer;
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e) {
        xfer(e, true, 1, 0L);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        loop0: while (true) {
            Node node = this.head;
            Node nodeSkipDeadNodes = null;
            while (node != null) {
                Node node2 = node.next;
                Object obj2 = node.item;
                boolean z = node.isData;
                if (obj2 == null) {
                    if (!z) {
                        break loop0;
                    }
                } else {
                    if (z) {
                        if (obj.equals(obj2) && node.tryMatch(obj2, null)) {
                            skipDeadNodes(nodeSkipDeadNodes, node, node, node2);
                            return true;
                        }
                        nodeSkipDeadNodes = node;
                    }
                    node = node2;
                }
                Node node3 = node;
                while (true) {
                    if (node2 == null || !node2.isMatched()) {
                        nodeSkipDeadNodes = skipDeadNodes(nodeSkipDeadNodes, node, node3, node2);
                        node = node2;
                    } else if (node3 != node2) {
                        node3 = node2;
                        node2 = node2.next;
                    }
                }
            }
            break loop0;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return bulkRemove(new f69(1, collection));
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        Objects.requireNonNull(predicate);
        return bulkRemove(predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return bulkRemove(new f69(0, collection));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return countOfMode(true);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        return new c(this);
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        E eXfer = xfer(null, false, 2, 0L);
        if (eXfer != null) {
            return eXfer;
        }
        Thread.interrupted();
        throw new InterruptedException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        return (T[]) toArrayInternal(tArr);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        int length;
        int i;
        String[] strArr = null;
        loop0: while (true) {
            Node node = this.head;
            length = 0;
            i = 0;
            while (true) {
                if (node == null) {
                    break loop0;
                }
                Object obj = node.item;
                if (!node.isData) {
                    if (obj == null) {
                        break loop0;
                    }
                } else if (obj != null) {
                    if (strArr == null) {
                        strArr = new String[4];
                    } else if (i == strArr.length) {
                        strArr = (String[]) Arrays.copyOf(strArr, i * 2);
                    }
                    String string = obj.toString();
                    strArr[i] = string;
                    length += string.length();
                    i++;
                }
                Node node2 = node.next;
                if (node == node2) {
                    break;
                }
                node = node2;
            }
        }
        if (i == 0) {
            return "[]";
        }
        char[] cArr = new char[(i * 2) + length];
        cArr[0] = '[';
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                int i4 = i2 + 1;
                cArr[i2] = ',';
                i2 += 2;
                cArr[i4] = ' ';
            }
            String str = strArr[i3];
            int length2 = str.length();
            str.getChars(0, length2, cArr, i2);
            i2 += length2;
        }
        cArr[i2] = ']';
        return new String(cArr);
    }

    @Override // java.util.concurrent.TransferQueue
    public void transfer(E e) throws InterruptedException {
        if (xfer(e, true, 2, 0L) == null) {
            return;
        }
        Thread.interrupted();
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.TransferQueue
    public boolean tryTransfer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        if (xfer(e, true, 3, timeUnit.toNanos(j)) == null) {
            return true;
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return false;
    }

    public final void unsplice(Node node, Node node2) {
        node2.waiter = null;
        if (node == null || node.next != node2) {
            return;
        }
        Node node3 = node2.next;
        if (node3 != null && (node3 == node2 || !node.casNext(node2, node3) || !node.isMatched())) {
            return;
        }
        while (true) {
            Node node4 = this.head;
            if (node4 == node || node4 == node2) {
                return;
            }
            if (!node4.isMatched()) {
                if (node.next == node || node2.next == node2) {
                    return;
                }
                this.needSweep = true;
                return;
            }
            Node node5 = node4.next;
            if (node5 == null) {
                return;
            }
            if (node5 != node4 && casHead(node4, node5)) {
                node4.selfLink();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArrayInternal(null);
    }

    public boolean offer(E e) {
        xfer(e, true, 1, 0L);
        return true;
    }

    public static final class Node implements ForkJoinPool.ManagedBlocker {
        private static final long serialVersionUID = -3375979862319811754L;
        final boolean isData;
        volatile Object item;
        volatile Node next;
        volatile Thread waiter;

        public Node(Object obj) {
            (void) LinkedTransferQueue34.ITEM.set(this, obj);
            this.isData = obj != null;
        }

        public final void appendRelaxed(Node node) {
            (void) LinkedTransferQueue34.NEXT.setOpaque(this, node);
        }

        @Override // java.util.concurrent.ForkJoinPool.ManagedBlocker
        public final boolean block() {
            while (!isReleasable()) {
                LockSupport.park();
            }
            return true;
        }

        public final boolean cannotPrecede(boolean z) {
            boolean z2 = this.isData;
            if (z2 != z) {
                if (z2 != (this.item == null)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean casItem(Object obj, Object obj2) {
            return (boolean) LinkedTransferQueue34.ITEM.compareAndSet(this, obj, obj2);
        }

        public final boolean casNext(Node node, Node node2) {
            return (boolean) LinkedTransferQueue34.NEXT.compareAndSet(this, node, node2);
        }

        public final boolean isMatched() {
            return this.isData == (this.item == null);
        }

        @Override // java.util.concurrent.ForkJoinPool.ManagedBlocker
        public final boolean isReleasable() {
            return this.isData == (this.item == null) || Thread.currentThread().isInterrupted();
        }

        public final void selfLink() {
            (void) LinkedTransferQueue34.NEXT.setRelease(this, this);
        }

        public final boolean tryMatch(Object obj, Object obj2) {
            if (!casItem(obj, obj2)) {
                return false;
            }
            LockSupport.unpark(this.waiter);
            return true;
        }

        public Node() {
            this.isData = true;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        Objects.requireNonNull(collection);
        int i = 0;
        if (collection == this) {
            ore.a();
            return 0;
        }
        while (true) {
            E ePoll = poll();
            if (ePoll == null) {
                return i;
            }
            collection.add(ePoll);
            i++;
        }
    }

    @Override // java.util.Queue
    public E poll() {
        return xfer(null, false, 0, 0L);
    }

    @Override // java.util.concurrent.TransferQueue
    public boolean tryTransfer(E e) {
        return xfer(e, true, 0, 0L) == null;
    }

    public LinkedTransferQueue34() {
        Node node = new Node();
        this.tail = node;
        this.head = node;
    }
}
