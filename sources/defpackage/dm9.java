package defpackage;

import java.util.Map;
import kotlin.collections.a;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final class dm9 implements aw8 {
    public final aw8 a;
    public final aw8 b;
    public final /* synthetic */ int c;
    public final hif d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dm9(aw8 aw8Var, aw8 aw8Var2, int i) {
        this(aw8Var, aw8Var2, (byte) 0);
        this.c = i;
        switch (i) {
            case 1:
                this(aw8Var, aw8Var2, (byte) 0);
                fif[] fifVarArr = new fif[0];
                if (r5h.X0("kotlin.Pair")) {
                    ore.p("Blank serial names are prohibited");
                    throw null;
                }
                tr3 tr3Var = new tr3("kotlin.Pair");
                tr3.a(tr3Var, "first", aw8Var.d());
                tr3.a(tr3Var, "second", aw8Var2.d());
                this.d = new hif("kotlin.Pair", c6h.f, tr3Var.c.size(), a.n1(fifVarArr), tr3Var);
                return;
            default:
                this.d = yab.l("kotlin.collections.Map.Entry", c6h.h, new fif[0], new w14(aw8Var, 26, aw8Var2));
                return;
        }
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        Object key;
        Object value;
        x74 x74VarA = u76Var.a(d());
        fif fifVarD = d();
        aw8 aw8Var = this.a;
        int i = this.c;
        switch (i) {
            case 0:
                key = ((Map.Entry) obj).getKey();
                break;
            default:
                key = ((ylc) obj).a;
                break;
        }
        x74VarA.i(fifVarD, 0, aw8Var, key);
        fif fifVarD2 = d();
        aw8 aw8Var2 = this.b;
        switch (i) {
            case 0:
                value = ((Map.Entry) obj).getValue();
                break;
            default:
                value = ((ylc) obj).b;
                break;
        }
        x74VarA.i(fifVarD2, 1, aw8Var2, value);
        d();
        x74VarA.c();
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        Object cm9Var;
        fif fifVarD = d();
        v74 v74VarA = r55Var.a(fifVarD);
        Object obj = rpk.a;
        Object objX = obj;
        Object objX2 = objX;
        while (true) {
            int iV = v74VarA.v(d());
            if (iV == -1) {
                if (objX == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objX2 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                switch (this.c) {
                    case 0:
                        cm9Var = new cm9(objX, objX2);
                        break;
                    default:
                        cm9Var = new ylc(objX, objX2);
                        break;
                }
                v74VarA.j(fifVarD);
                return cm9Var;
            }
            if (iV == 0) {
                objX = v74VarA.x(d(), 0, this.a, null);
            } else {
                if (iV != 1) {
                    throw new SerializationException(zo5.h(iV, "Invalid index: "));
                }
                objX2 = v74VarA.x(d(), 1, this.b, null);
            }
        }
    }

    @Override // defpackage.aw8
    public final fif d() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d;
    }

    public dm9(aw8 aw8Var, aw8 aw8Var2, byte b) {
        this.a = aw8Var;
        this.b = aw8Var2;
    }
}
