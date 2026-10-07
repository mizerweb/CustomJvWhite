package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.collections.a;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final class na6 implements aw8 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public final ny8 d;

    public na6(Object obj, String str) {
        this.a = 1;
        this.b = obj;
        this.c = r66.a;
        this.d = rx8.P(2, new vx9(str, 14, this));
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        switch (this.a) {
            case 0:
                Enum r5 = (Enum) obj;
                Enum[] enumArr = (Enum[]) this.b;
                int iE1 = a.e1(enumArr, r5);
                if (iE1 != -1) {
                    u76Var.l(d(), iE1);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                String strI = d().i();
                String string = Arrays.toString(enumArr);
                sb.append(" is not a valid enum ");
                sb.append(strI);
                sb.append(", must be one of ");
                sb.append(string);
                throw new SerializationException(sb.toString());
            default:
                x74 x74VarA = u76Var.a(d());
                d();
                x74VarA.c();
                return;
        }
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Enum[] enumArr = (Enum[]) obj;
                int iZ = r55Var.z(d());
                if (iZ >= 0 && iZ < enumArr.length) {
                    return enumArr[iZ];
                }
                throw new SerializationException(iZ + " is not among valid " + d().i() + " enum values, values size is " + enumArr.length);
            default:
                fif fifVarD = d();
                v74 v74VarA = r55Var.a(fifVarD);
                int iV = v74VarA.v(d());
                if (iV != -1) {
                    throw new SerializationException(zo5.h(iV, "Unexpected index "));
                }
                v74VarA.j(fifVarD);
                return obj;
        }
    }

    @Override // defpackage.aw8
    public final fif d() {
        switch (this.a) {
            case 0:
                return (fif) ((ifh) this.d).getValue();
            default:
                return (fif) this.d.getValue();
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + d().i() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public na6(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        this.a = 1;
        this.c = Arrays.asList(annotationArr);
    }

    public na6(String str, Enum[] enumArr) {
        this.a = 0;
        this.b = enumArr;
        this.d = new ifh(new dx4(this, 6, str));
    }
}
