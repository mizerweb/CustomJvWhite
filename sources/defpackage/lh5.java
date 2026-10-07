package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lh5 implements Iterator, uv8 {
    public int a = -1;
    public int b;
    public int c;
    public hj8 d;
    public int e;
    public final /* synthetic */ mh5 f;

    public lh5(mh5 mh5Var) {
        this.f = mh5Var;
        int iV = oc9.v(0, 0, mh5Var.a.length());
        this.b = iV;
        this.c = iV;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    public final void a() {
        ylc ylcVar;
        mh5 mh5Var = this.f;
        CharSequence charSequence = mh5Var.a;
        int i = this.c;
        if (i < 0) {
            this.a = 0;
            this.d = null;
            return;
        }
        int i2 = mh5Var.b;
        if (i2 > 0) {
            int i3 = this.e + 1;
            this.e = i3;
            if (i3 >= i2) {
                this.d = new hj8(this.b, r5h.Q0(charSequence), 1);
                this.c = -1;
            } else if (i > charSequence.length() && (ylcVar = (ylc) mh5Var.c.invoke(charSequence, Integer.valueOf(this.c))) != null) {
                int iIntValue = ((Number) ylcVar.a).intValue();
                int iIntValue2 = ((Number) ylcVar.b).intValue();
                this.d = oc9.f0(this.b, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.b = i4;
                this.c = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.d = new hj8(this.b, r5h.Q0(charSequence), 1);
                this.c = -1;
            }
        } else if (i > charSequence.length()) {
            this.d = new hj8(this.b, r5h.Q0(charSequence), 1);
            this.c = -1;
        } else {
            int iIntValue3 = ((Number) ylcVar.a).intValue();
            int iIntValue4 = ((Number) ylcVar.b).intValue();
            this.d = oc9.f0(this.b, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.b = i5;
            this.c = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            qr7.d();
            return null;
        }
        hj8 hj8Var = this.d;
        this.d = null;
        this.a = -1;
        return hj8Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
