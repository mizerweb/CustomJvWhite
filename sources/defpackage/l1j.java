package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class l1j implements q5j {
    public final long a;
    public final long b;
    public final mg5 c;
    public final String d;
    public final rui e;
    public k1j f = k1j.a;
    public float g = 0.0f;
    public long h;
    public final e3j i;
    public final y3d j;
    public final et3 k;
    public final e5d l;

    public l1j(long j, long j2, mg5 mg5Var, String str, rui ruiVar, long j3, e3j e3jVar, w8g w8gVar, et3 et3Var, e5d e5dVar) {
        this.a = j;
        this.b = j2;
        this.c = mg5Var;
        this.d = str;
        this.e = ruiVar;
        this.h = j3;
        this.i = e3jVar;
        this.j = w8gVar;
        this.k = et3Var;
        this.l = e5dVar;
    }

    public final mg5 a() {
        return this.c;
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final float d() {
        return this.g;
    }

    public final rui e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1j)) {
            return false;
        }
        l1j l1jVar = (l1j) obj;
        return this.a == l1jVar.a && this.b == l1jVar.b && this.c == l1jVar.c && this.d.equals(l1jVar.d) && this.e.equals(l1jVar.e) && this.f == l1jVar.f && Float.compare(this.g, l1jVar.g) == 0 && this.h == l1jVar.h && this.i.equals(l1jVar.i) && cqk.d(this.j, l1jVar.j) && cqk.d(this.k, l1jVar.k) && cqk.d(this.l, l1jVar.l);
    }

    public final boolean f() {
        k1j k1jVar = this.f;
        return k1jVar == k1j.b || k1jVar == k1j.c;
    }

    public final boolean g() {
        k1j k1jVar = this.f;
        return k1jVar == k1j.e || k1jVar == k1j.f;
    }

    public final void h(k1j k1jVar) {
        this.f = k1jVar;
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + qt4.g(nbh.m((this.f.hashCode() + ((this.e.hashCode() + zo5.d((this.c.hashCode() + qt4.g(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d)) * 31)) * 31, this.g, 31), 31, this.h)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.q5j
    public final boolean isDebugEnabled() {
        return ((xb9) this.k).g0() && ((Boolean) this.l.x().i()).booleanValue();
    }

    @Override // defpackage.q5j
    public final int k() {
        return this.e.getHeight();
    }

    @Override // defpackage.q5j
    public final int n() {
        return this.e.getWidth();
    }

    @Override // defpackage.q5j
    public final void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.i.H(null);
    }

    public final String toString() {
        k1j k1jVar = this.f;
        float f = this.g;
        long j = this.h;
        StringBuilder sbS = qt4.s(this.a, "VideoMessageState(localChatId=", ", messageId=");
        sbS.append(this.b);
        sbS.append(", itemType=");
        sbS.append(this.c);
        sbS.append(", attachId=");
        sbS.append(this.d);
        sbS.append(", videoContent=");
        sbS.append(this.e);
        sbS.append(", state=");
        sbS.append(k1jVar);
        sbS.append(", progress=");
        sbS.append(f);
        qt4.z(j, ", durationProgress=", ", player=", sbS);
        sbS.append(this.i);
        sbS.append(", playerHolder=");
        sbS.append(this.j);
        sbS.append(", clientPrefs=");
        sbS.append(this.k);
        sbS.append(", pmsProperties=");
        sbS.append(this.l);
        sbS.append(")");
        return sbS.toString();
    }

    @Override // defpackage.q5j
    public final int v() {
        return 3;
    }

    @Override // defpackage.q5j
    public final void x(Surface surface, uvi uviVar) {
        e3j e3jVar = this.i;
        e3jVar.H(surface);
        e3jVar.C(uviVar);
    }
}
