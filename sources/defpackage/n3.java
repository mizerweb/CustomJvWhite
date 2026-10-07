package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tracer.minidump.Minidump;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements j8e, t3d {
    public final Object a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public n3(dq4 dq4Var, xhh xhhVar, ka0 ka0Var, w7b w7bVar, d0j d0jVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        za0 za0Var = new za0(xhhVar, ka0Var, w7bVar, dq4Var, ny8Var5, ny8Var4);
        this.a = za0Var;
        hbc hbcVar = new hbc(dq4Var, ny8Var, ny8Var2, ny8Var3, ny8Var4, ny8Var5, xhhVar, d0jVar);
        this.b = hbcVar;
        this.c = za0Var;
        dab dabVar = new dab(new fz6(e9i.m0(za0Var.i, (q8e) hbcVar.h), new wyj(this, null, 12)), this, 4);
        a8g a8gVar = j0g.a;
        jza jzaVar = jza.a;
        r8e r8eVarG0 = e9i.G0(dabVar, dq4Var, a8gVar, jzaVar);
        this.d = r8eVarG0;
        mjg mjgVarA = p90.a(jzaVar);
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
        this.g = e9i.G0(e9i.m0(za0Var.j, (r8e) hbcVar.i), dq4Var, j0g.b, Float.valueOf(0.0f));
        tre.m0(new fz6(r8eVarG0, new y73(this, (lq4) null, 15), 3), dq4Var);
    }

    @Override // defpackage.t3d
    public void a() {
        ((t3d) this.c).a();
    }

    @Override // defpackage.t3d
    public void b() {
        ((t3d) this.c).b();
    }

    @Override // defpackage.t3d
    public i65 c() {
        return ((t3d) this.c).c();
    }

    public rac d() {
        return (rac) this.d;
    }

    public rac e() {
        return (rac) this.e;
    }

    public rac f() {
        return (rac) this.c;
    }

    public rac g() {
        return (rac) this.f;
    }

    public rac h() {
        return (rac) this.g;
    }

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        return (m3) this.g;
    }

    @Override // defpackage.t3d
    public void pause() {
        ((t3d) this.c).pause();
    }

    public n3(jv4 jv4Var, snf snfVar, khh khhVar, oe9 oe9Var, uy8 uy8Var, j85 j85Var) {
        this.a = jv4Var;
        this.b = snfVar;
        this.c = khhVar;
        this.d = oe9Var;
        this.e = uy8Var;
        swh swhVar = swh.a;
        Object obj = swh.c().get(gm0.c);
        if ((obj instanceof fv4 ? (fv4) obj : null) == null) {
            try {
                Minidump minidump = Minidump.c;
            } catch (Throwable unused) {
            }
        }
        this.f = new uuh(BuildConfig.MAX_TIME_TO_UPLOAD);
        this.g = new AtomicInteger();
    }

    public n3(String str, Object obj, ry8 ry8Var, pzf pzfVar, sr3 sr3Var) {
        this.a = str;
        this.c = obj;
        this.d = ry8Var;
        this.e = pzfVar;
        this.f = sr3Var;
        this.b = n3.class.getName();
        this.g = new m3(this);
    }

    public n3(qu quVar, ag5 ag5Var, rac racVar, rac racVar2, rac racVar3, rac racVar4, rac racVar5) {
        this.a = quVar;
        this.b = ag5Var;
        this.c = racVar;
        this.d = racVar2;
        this.e = racVar3;
        this.f = racVar4;
        this.g = racVar5;
    }
}
