package defpackage;

import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class z7f {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public z7f(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, nq4 nq4Var) {
        x7f x7fVar;
        c79 c79VarW;
        utc utcVar;
        Object obj;
        c79 c79Var;
        utc utcVar2;
        if (nq4Var instanceof x7f) {
            x7fVar = (x7f) nq4Var;
            int i = x7fVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                x7fVar.j = i - Integer.MIN_VALUE;
            } else {
                x7fVar = new x7f(this, nq4Var);
            }
        } else {
            x7fVar = new x7f(this, nq4Var);
        }
        Object obj2 = x7fVar.h;
        int i2 = x7fVar.j;
        if (i2 == 0) {
            ch3.d0(obj2);
            c79VarW = yab.w();
            ny8 ny8Var = this.a;
            zu6 zu6Var = (zu6) ny8Var.getValue();
            zu6Var.getClass();
            ny8 ny8Var2 = zu6Var.a;
            if (str.length() < 8 || !((lge) zu6.b.getValue()).b(str)) {
                utcVar = new utc(null, false);
            } else {
                try {
                    luc lucVarT = r5h.o1(str, '8') ? ((vtc) ny8Var2.getValue()).t(str, "RU") : ((vtc) ny8Var2.getValue()).t(str, null);
                    utcVar = new utc(lucVarT, ((vtc) ny8Var2.getValue()).m(lucVarT));
                } catch (NumberParseException unused) {
                    utcVar = new utc(null, false);
                }
            }
            luc lucVar = utcVar.a;
            if (lucVar != null) {
                ((zu6) ny8Var.getValue()).getClass();
                int i3 = lucVar.b;
                long j = lucVar.c;
                StringBuilder sb = new StringBuilder();
                sb.append(i3);
                sb.append(j);
                long j2 = Long.parseLong(sb.toString());
                x7fVar.d = str;
                x7fVar.e = c79VarW;
                x7fVar.f = c79VarW;
                x7fVar.g = utcVar;
                x7fVar.j = 1;
                Object objB = b(j2, x7fVar);
                hu4 hu4Var = hu4.a;
                if (objB == hu4Var) {
                    return hu4Var;
                }
                obj = objB;
                c79Var = c79VarW;
                utcVar2 = utcVar;
            }
            return yab.j(c79VarW);
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        utcVar2 = x7fVar.g;
        c79 c79Var2 = x7fVar.f;
        c79Var = x7fVar.e;
        String str2 = x7fVar.d;
        ch3.d0(obj2);
        c79VarW = c79Var2;
        str = str2;
        obj = obj2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (str.length() > 0 && utcVar2.b && !zBooleanValue) {
            c79VarW.add(v7f.a);
        }
        c79VarW = c79Var;
        return yab.j(c79VarW);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, nq4 nq4Var) {
        y7f y7fVar;
        if (nq4Var instanceof y7f) {
            y7fVar = (y7f) nq4Var;
            int i = y7fVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                y7fVar.g = i - Integer.MIN_VALUE;
            } else {
                y7fVar = new y7f(this, nq4Var);
            }
        } else {
            y7fVar = new y7f(this, nq4Var);
        }
        Object objB = y7fVar.e;
        int i2 = y7fVar.g;
        if (i2 == 0) {
            ch3.d0(objB);
            utd utdVar = (utd) this.b.getValue();
            long jT = ((s7f) ((et3) this.c.getValue())).t();
            y7fVar.d = j;
            y7fVar.g = 1;
            objB = utdVar.b(jT, y7fVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = y7fVar.d;
            ch3.d0(objB);
        }
        return Boolean.valueOf(((vjd) objB).d.w() == j);
    }
}
