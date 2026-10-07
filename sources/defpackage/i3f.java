package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i3f {
    public static final v9g a;
    public static final z2f b;
    public static final bn8 c;

    static {
        try {
            v9g v9gVar = h3f.a;
            Objects.requireNonNull(v9gVar, "Scheduler Supplier result can't be null");
            a = v9gVar;
            try {
                p84 p84Var = e3f.a;
                Objects.requireNonNull(p84Var, "Scheduler Supplier result can't be null");
                b = p84Var;
                try {
                    bn8 bn8Var = f3f.a;
                    Objects.requireNonNull(bn8Var, "Scheduler Supplier result can't be null");
                    c = bn8Var;
                    int i = lzh.b;
                    try {
                        Objects.requireNonNull(g3f.a, "Scheduler Supplier result can't be null");
                    } catch (Throwable th) {
                        throw gd6.b(th);
                    }
                } catch (Throwable th2) {
                    throw gd6.b(th2);
                }
            } catch (Throwable th3) {
                throw gd6.b(th3);
            }
        } catch (Throwable th4) {
            throw gd6.b(th4);
        }
    }

    public static z2f a() {
        z2f z2fVar = b;
        lhb lhbVar = tre.m;
        return lhbVar == null ? z2fVar : (z2f) tre.H(lhbVar, z2fVar);
    }

    public static z2f b() {
        bn8 bn8Var = c;
        gp0 gp0Var = tre.o;
        return gp0Var == null ? bn8Var : (z2f) tre.H(gp0Var, bn8Var);
    }
}
