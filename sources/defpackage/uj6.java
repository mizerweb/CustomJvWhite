package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class uj6 implements jg7, f20 {
    public Object a;
    public long b;
    public Object c;
    public Object d;
    public Object e;

    public uj6(x5j x5jVar, long j) {
        this.c = x5jVar;
        this.b = j;
        this.a = uj6.class.getName();
        this.e = new AccelerateDecelerateInterpolator();
    }

    @Override // defpackage.jg7
    public void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        o3a o3aVar = (o3a) ((m3a) this.e).e;
        if (this != o3aVar.s) {
            return;
        }
        v2a v2aVar = o3aVar.m;
        d0a d0aVarK = mz8.k((b0a) this.c, (String) this.a, (Uri) this.d, this.b, bitmap);
        q2a q2aVar = (q2a) v2aVar.b;
        q2aVar.i = d0aVarK;
        q2aVar.a.setMetadata(d0aVarK.e());
        d3a d3aVar = o3aVar.g;
        vqi.d0(d3aVar.o, new w2a(d3aVar, 1));
    }

    @Override // defpackage.f20
    public Object b(long j, p20 p20Var, nq4 nq4Var) {
        Object objK = p20Var.K(j, nq4Var);
        return objK == hu4.a ? objK : sbi.a;
    }

    @Override // defpackage.f20
    public String c() {
        return (String) this.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // defpackage.f20
    public Object d(long j, p20 p20Var, nq4 nq4Var) {
        ehe eheVar;
        long j2;
        long j3;
        rt2 rt2Var;
        long jY;
        String str;
        a4c a4cVar;
        String str2;
        a4c a4cVar2;
        je9 je9Var = je9.d;
        if (nq4Var instanceof ehe) {
            eheVar = (ehe) nq4Var;
            int i = eheVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                eheVar.i = i - Integer.MIN_VALUE;
            } else {
                eheVar = new ehe(this, nq4Var);
            }
        } else {
            eheVar = new ehe(this, nq4Var);
        }
        Object objV = eheVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = eheVar.i;
        if (i2 == 0) {
            ch3.d0(objV);
            xn3 xn3Var = (xn3) ((ny8) this.d).getValue();
            long j4 = this.b;
            eheVar.f = p20Var;
            eheVar.d = j;
            eheVar.i = 1;
            objV = xn3Var.v(j4, eheVar);
            if (objV != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            j = eheVar.d;
            p20Var = eheVar.f;
            ch3.d0(objV);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = eheVar.e;
            j2 = eheVar.d;
            p20Var = eheVar.f;
            ch3.d0(objV);
        }
        rt2Var = (rt2) objV;
        if (rt2Var == null) {
            str2 = (String) ((qg7) this.c).b;
            a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, zo5.j(j3, "Can't get chat by serverId: "), null);
            }
        } else {
            jY = rt2Var.y();
            str = (String) ((qg7) this.c).b;
            a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                StringBuilder sbS = qt4.s(j3, "Chat exists by serverId: ", ", try load around with Long.MAX_VALUE, lastMessageTime: ");
                sbS.append(jY);
                a4cVar.c(je9Var, str, qt4.k(j2, ", prevTime: ", sbS), null);
            }
            if (j2 == 0) {
                p20Var.m(BuildConfig.MAX_TIME_TO_UPLOAD);
            } else {
                p20Var.m(j2);
            }
        }
        return sbi.a;
        long jA = ((rt2) objV).A();
        qk7 qk7Var = (qk7) ((ny8) this.e).getValue();
        eheVar.f = p20Var;
        eheVar.d = j;
        eheVar.e = jA;
        eheVar.i = 2;
        objV = qk7Var.a(jA, true, eheVar);
        if (objV != hu4Var) {
            j2 = j;
            j3 = jA;
            rt2Var = (rt2) objV;
            if (rt2Var == null) {
                str2 = (String) ((qg7) this.c).b;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    a4cVar2.c(je9Var, str2, zo5.j(j3, "Can't get chat by serverId: "), null);
                }
            } else {
                jY = rt2Var.y();
                str = (String) ((qg7) this.c).b;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    StringBuilder sbS2 = qt4.s(j3, "Chat exists by serverId: ", ", try load around with Long.MAX_VALUE, lastMessageTime: ");
                    sbS2.append(jY);
                    a4cVar.c(je9Var, str, qt4.k(j2, ", prevTime: ", sbS2), null);
                }
                if (j2 == 0) {
                    p20Var.m(BuildConfig.MAX_TIME_TO_UPLOAD);
                } else {
                    p20Var.m(j2);
                }
            }
            return sbi.a;
        }
        return hu4Var;
    }

    @Override // defpackage.f20
    public Object e(n20 n20Var) {
        return ((xn3) ((ny8) this.d).getValue()).v(this.b, n20Var);
    }

    public void g() {
        x5j x5jVar = (x5j) this.c;
        ObjectAnimator objectAnimator = (ObjectAnimator) this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (x5jVar.getAlpha() < 1.0f) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(x5jVar, (Property<x5j, Float>) View.ALPHA, x5jVar.getAlpha(), 1.0f);
            objectAnimatorOfFloat.setDuration(this.b);
            objectAnimatorOfFloat.setInterpolator((AccelerateDecelerateInterpolator) this.e);
            objectAnimatorOfFloat.addListener(new li(8, this));
            objectAnimatorOfFloat.start();
            this.d = objectAnimatorOfFloat;
        }
    }

    public void h() {
        ObjectAnimator objectAnimator = (ObjectAnimator) this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.jg7
    public void onFailure(Throwable th) {
        if (this != ((o3a) ((m3a) this.e).e).s) {
            return;
        }
        lvb.G0("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    public /* synthetic */ uj6(x5j x5jVar) {
        this(x5jVar, 150L);
    }

    public uj6(long j, qg7 qg7Var, ny8 ny8Var, ny8 ny8Var2) {
        this.b = j;
        this.c = qg7Var;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.a = String.valueOf(j);
    }

    public uj6(m3a m3aVar, b0a b0aVar, String str, Uri uri, long j) {
        this.e = m3aVar;
        this.c = b0aVar;
        this.a = str;
        this.d = uri;
        this.b = j;
    }
}
