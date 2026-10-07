package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class py6 implements yx6 {
    public final /* synthetic */ vfe a;
    public final /* synthetic */ u8h b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ wfe e;
    public final /* synthetic */ njd f;
    public final /* synthetic */ gu4 g;
    public final /* synthetic */ vt4 h;

    public py6(vfe vfeVar, u8h u8hVar, long j, long j2, wfe wfeVar, njd njdVar, gu4 gu4Var, vt4 vt4Var) {
        this.a = vfeVar;
        this.b = u8hVar;
        this.c = j;
        this.d = j2;
        this.e = wfeVar;
        this.f = njdVar;
        this.g = gu4Var;
        this.h = vt4Var;
    }

    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) throws IllegalAccessException, InvocationTargetException {
        vfe vfeVar = this.a;
        long j = vfeVar.a + (((Boolean) this.b.invoke(obj)).booleanValue() ? this.c : this.d);
        ghb ghbVar = ew5.b;
        long jG = ew5.g(qe7.P(System.nanoTime(), lw5.NANOSECONDS));
        sbi sbiVar = sbi.a;
        wfe wfeVar = this.e;
        if (j <= jG) {
            vfeVar.a = jG;
            tt4 tt4Var = (xf5) wfeVar.a;
            if (tt4Var != null) {
                ((up8) tt4Var).b(null);
            }
            Object objA = this.f.f.a(lq4Var, obj);
            return objA == hu4.a ? objA : sbiVar;
        }
        long j2 = vfeVar.a;
        tt4 tt4Var2 = (xf5) wfeVar.a;
        if (tt4Var2 != null) {
            ((up8) tt4Var2).b(null);
        }
        wfeVar.a = yab.h(this.g, null, 0, new oy6(j, j2, vfeVar, this.h, this.f, obj, null), 3);
        return sbiVar;
    }
}
