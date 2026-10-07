package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ql9 extends sl9 implements Iterator, uv8 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql9(ul9 ul9Var, int i) {
        super(ul9Var);
        this.e = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        Serializable serializable = this.d;
        switch (i) {
            case 0:
                a();
                int i2 = this.a;
                ul9 ul9Var = (ul9) serializable;
                if (i2 >= ul9Var.f) {
                    qr7.d();
                    return null;
                }
                this.a = i2 + 1;
                this.b = i2;
                rl9 rl9Var = new rl9(ul9Var, i2);
                d();
                return rl9Var;
            default:
                a();
                int i3 = this.a;
                ul9 ul9Var2 = (ul9) serializable;
                if (i3 >= ul9Var2.f) {
                    qr7.d();
                    return null;
                }
                this.a = i3 + 1;
                this.b = i3;
                Object obj = ul9Var2.a[i3];
                d();
                return obj;
        }
    }
}
