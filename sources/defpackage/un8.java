package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class un8 extends pci {
    public int b;
    public Object c;
    public final /* synthetic */ int d;
    public final Iterator e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public un8(hof hofVar) {
        this();
        this.d = 1;
        this.f = hofVar;
        this.e = hofVar.c.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        lvb.b0(this.b != 4);
        int iD = qt4.D(this.b);
        if (iD == 0) {
            return true;
        }
        if (iD != 2) {
            this.b = 4;
            int i = this.d;
            Object obj = null;
            Object obj2 = this.f;
            Iterator it = this.e;
            switch (i) {
                case 0:
                    while (true) {
                        if (!it.hasNext()) {
                            this.b = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((ddd) obj2).apply(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
                case 1:
                    while (true) {
                        if (!it.hasNext()) {
                            this.b = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((hof) obj2).d.contains(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    while (true) {
                        if (!it.hasNext()) {
                            this.b = 3;
                            break;
                        } else {
                            next = it.next();
                            if (!((jag) ((hof) obj2).d).d.equals(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
            }
            this.c = obj;
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            qr7.d();
            return null;
        }
        this.b = 2;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public un8(Iterator it, ddd dddVar) {
        this();
        this.d = 0;
        this.e = it;
        this.f = dddVar;
    }

    public un8() {
        super(0);
        this.b = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public un8(hof hofVar, byte b) {
        this();
        this.d = 2;
        this.f = hofVar;
        this.e = hofVar.c.iterator();
    }
}
