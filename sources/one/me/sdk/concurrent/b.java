package one.me.sdk.concurrent;

import defpackage.qr7;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Iterator {
    public LinkedTransferQueue34.Node a;
    public Object b;
    public LinkedTransferQueue34.Node c;
    public LinkedTransferQueue34.Node d;
    public final /* synthetic */ LinkedTransferQueue34 e;

    public b(LinkedTransferQueue34 linkedTransferQueue34) {
        this.e = linkedTransferQueue34;
        a(null);
    }

    public final void a(LinkedTransferQueue34.Node node) {
        LinkedTransferQueue34.Node node2 = node == null ? this.e.head : node.next;
        LinkedTransferQueue34.Node node3 = node2;
        while (node2 != null) {
            Object obj = node2.item;
            if (obj != null && node2.isData) {
                this.a = node2;
                this.b = obj;
                if (node3 != node2) {
                    this.e.tryCasSuccessor(node, node3, node2);
                    return;
                }
                return;
            }
            if (!node2.isData && obj == null) {
                break;
            }
            if (node3 != node2) {
                if (this.e.tryCasSuccessor(node, node3, node2)) {
                    node3 = node2;
                } else {
                    node3 = node2.next;
                    node = node2;
                    node2 = node3;
                }
            }
            LinkedTransferQueue34.Node node4 = node2.next;
            if (node2 == node4) {
                node2 = this.e.head;
                node3 = node2;
                node = null;
            } else {
                node2 = node4;
            }
        }
        this.b = null;
        this.a = null;
    }

    @Override // java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        LinkedTransferQueue34.Node node = null;
        while (true) {
            LinkedTransferQueue34.Node node2 = this.a;
            if (node2 == null) {
                break;
            }
            consumer.accept(this.b);
            a(node2);
            node = node2;
        }
        if (node != null) {
            this.c = node;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        LinkedTransferQueue34.Node node = this.a;
        if (node == null) {
            qr7.d();
            return null;
        }
        Object obj = this.b;
        this.c = node;
        a(node);
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x005e A[SYNTHETIC] */
    @Override // java.util.Iterator
    public final void remove() {
        LinkedTransferQueue34.Node node;
        LinkedTransferQueue34.Node node2 = this.c;
        if (node2 == null) {
            defpackage.c.t();
            return;
        }
        this.c = null;
        if (node2.item == null) {
            return;
        }
        LinkedTransferQueue34.Node node3 = this.d;
        LinkedTransferQueue34.Node node4 = node3 == null ? this.e.head : node3.next;
        LinkedTransferQueue34.Node node5 = node4;
        while (node4 != null) {
            Object obj = node4.item;
            if (node4 == node2) {
                if (obj != null) {
                    node4.tryMatch(obj, null);
                }
                LinkedTransferQueue34.Node node6 = node4.next;
                if (node6 != null) {
                    node4 = node6;
                }
                if (node5 != node4) {
                    this.e.tryCasSuccessor(node3, node5, node4);
                }
                this.d = node3;
                return;
            }
            boolean z = obj != null && node4.isData;
            if (!z && !node4.isData && obj == null) {
                return;
            }
            if (node5 != node4) {
                if (this.e.tryCasSuccessor(node3, node5, node4)) {
                    node5 = node4;
                    if (z) {
                        node = node4.next;
                        if (node4 == node) {
                            node4 = this.e.head;
                            node5 = node4;
                            node3 = null;
                        } else {
                            node4 = node;
                        }
                    }
                }
                node5 = node4.next;
                node3 = node4;
                node4 = node5;
            } else if (z) {
                node = node4.next;
                if (node4 == node) {
                    node4 = this.e.head;
                    node5 = node4;
                    node3 = null;
                } else {
                    node4 = node;
                }
            } else {
                node5 = node4.next;
                node3 = node4;
                node4 = node5;
            }
        }
    }
}
