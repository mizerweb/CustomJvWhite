package one.me.sdk.concurrent;

import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Spliterator {
    public LinkedTransferQueue34.Node a;
    public int b;
    public boolean c;
    public final /* synthetic */ LinkedTransferQueue34 d;

    public c(LinkedTransferQueue34 linkedTransferQueue34) {
        this.d = linkedTransferQueue34;
    }

    public final LinkedTransferQueue34.Node a() {
        LinkedTransferQueue34.Node nodeFirstDataNode = this.a;
        if (nodeFirstDataNode == null && !this.c) {
            nodeFirstDataNode = this.d.firstDataNode();
            this.a = nodeFirstDataNode;
            if (nodeFirstDataNode == null) {
                this.c = true;
            }
        }
        return nodeFirstDataNode;
    }

    @Override // java.util.Spliterator
    public final int characteristics() {
        return 4368;
    }

    @Override // java.util.Spliterator
    public final long estimateSize() {
        return BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    @Override // java.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        LinkedTransferQueue34.Node nodeA = a();
        if (nodeA != null) {
            this.a = null;
            this.c = true;
            this.d.forEachFrom(consumer, nodeA);
        }
    }

    @Override // java.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        LinkedTransferQueue34.Node node;
        Objects.requireNonNull(consumer);
        LinkedTransferQueue34.Node nodeA = a();
        if (nodeA == null) {
            return false;
        }
        while (true) {
            obj = nodeA.item;
            boolean z = nodeA.isData;
            node = nodeA.next;
            if (nodeA == node) {
                node = this.d.head;
            }
            if (z) {
                if (obj == null) {
                    break;
                }
                break;
            }
            if (obj == null) {
                node = null;
            }
            if (node == null) {
                obj = null;
                break;
            }
            nodeA = node;
        }
        this.a = node;
        if (node == null) {
            this.c = true;
        }
        if (obj == null) {
            return false;
        }
        consumer.accept(obj);
        return true;
    }

    @Override // java.util.Spliterator
    public final Spliterator trySplit() {
        LinkedTransferQueue34.Node node;
        LinkedTransferQueue34.Node nodeA = a();
        if (nodeA != null && (node = nodeA.next) != null) {
            int iMin = Math.min(this.b + 1, 33554432);
            this.b = iMin;
            Object[] objArr = null;
            int i = 0;
            do {
                Object obj = nodeA.item;
                if (!nodeA.isData) {
                    if (obj == null) {
                        nodeA = null;
                        break;
                    }
                } else if (obj != null) {
                    if (objArr == null) {
                        objArr = new Object[iMin];
                    }
                    objArr[i] = obj;
                    i++;
                }
                nodeA = nodeA == node ? this.d.firstDataNode() : node;
                if (nodeA == null || (node = nodeA.next) == null) {
                    break;
                }
            } while (i < iMin);
            this.a = nodeA;
            if (nodeA == null) {
                this.c = true;
            }
            if (i != 0) {
                return Spliterators.spliterator(objArr, 0, i, 4368);
            }
        }
        return null;
    }
}
