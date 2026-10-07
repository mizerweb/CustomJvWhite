package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class rbd implements qbd {
    public final Object[] a;
    public int b;

    public rbd(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            ore.p("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // defpackage.qbd
    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return obj;
    }

    public void b(ow owVar) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = owVar;
            this.b = i + 1;
        }
    }

    @Override // defpackage.qbd
    public boolean d(Object obj) {
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                ore.k("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public rbd() {
        this.a = new Object[np0.n];
    }
}
