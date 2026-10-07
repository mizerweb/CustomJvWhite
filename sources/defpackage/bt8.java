package defpackage;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bt8 implements aw8 {
    public final sr3 a;
    public final hif b;

    public bt8(sr3 sr3Var) {
        this.a = sr3Var;
        this.b = yab.m("JsonContentPolymorphicSerializer<" + sr3Var.h() + '>', sad.f, new fif[0]);
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.b().getClass();
        sr3 sr3Var = this.a;
        if (sr3Var.i(obj)) {
            e9i.g0(1, null);
        }
        sr3 sr3VarA = zfe.a(obj.getClass());
        aw8 aw8VarL = qe7.l(sr3VarA, new aw8[0]);
        if (aw8VarL == null) {
            aw8VarL = uhd.b(sr3VarA);
        }
        if (aw8VarL != null) {
            aw8VarL.a(u76Var, obj);
            return;
        }
        sr3 sr3VarA2 = zfe.a(obj.getClass());
        String strH = sr3VarA2.h();
        if (strH == null) {
            strH = String.valueOf(sr3VarA2);
        }
        throw new SerializationException(nbh.w("Class '", strH, "' is not registered for polymorphic serialization ", "in the scope of '" + sr3Var.h() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        r55 qu8Var;
        gt8 gt8VarI = qe7.i(r55Var);
        jt8 jt8VarF = gt8VarI.f();
        aw8 aw8VarE = e(jt8VarF);
        qs8 qs8VarB = gt8VarI.B();
        aw8 aw8Var = aw8VarE;
        qs8VarB.getClass();
        if (jt8VarF instanceof cu8) {
            qu8Var = new dv8(qs8VarB, (cu8) jt8VarF, (String) null, 12);
        } else if (jt8VarF instanceof ss8) {
            qu8Var = new ev8(qs8VarB, (ss8) jt8VarF);
        } else {
            if (!(jt8VarF instanceof vt8) && !jt8VarF.equals(zt8.INSTANCE)) {
                ore.o();
                return null;
            }
            qu8Var = new qu8(qs8VarB, (pu8) jt8VarF);
        }
        return qu8Var.d(aw8Var);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return this.b;
    }

    public abstract aw8 e(jt8 jt8Var);
}
