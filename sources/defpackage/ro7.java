package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncodeException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ro7 implements ug4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ro7(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ug4
    public final void accept(Object obj) {
        Object h0eVar;
        tzd tzdVar;
        jce jceVar;
        switch (this.a) {
            case 0:
                op0 op0Var = (op0) this.b;
                vo7 vo7Var = (vo7) this.c;
                h0b h0bVar = (h0b) obj;
                je9 je9Var = je9.d;
                yab.n("The detector does not exist", h0bVar.a.containsKey(op0Var) || h0bVar.b.containsKey(op0Var));
                List<np0> list = (List) h0bVar.a.get(op0Var);
                if (list != null) {
                    mjg mjgVar = vo7Var.g;
                    if (list.isEmpty()) {
                        h0eVar = g0e.a;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (np0 np0Var : list) {
                            String strL = np0Var.l();
                            Rect rectA = np0Var.a();
                            if (strL == null || rectA == null) {
                                String str = vo7Var.i;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null && a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "GoogleMlKit scanner text(" + (gm0.c() ? strL != null ? r5h.u1(5, strL) : null : "***") + ") or bounds(" + rectA + ") is null", null);
                                }
                                tzdVar = null;
                            } else {
                                tzdVar = new tzd(strL, rectA);
                            }
                            if (tzdVar != null) {
                                arrayList.add(tzdVar);
                            }
                        }
                        h0eVar = new h0e(arrayList, false);
                    }
                    mjgVar.getClass();
                    mjgVar.j(null, h0eVar);
                    break;
                } else {
                    yab.n("The detector does not exist", h0bVar.a.containsKey(op0Var) || h0bVar.b.containsKey(op0Var));
                    Throwable th = (Throwable) h0bVar.b.get(op0Var);
                    String str2 = vo7Var.i;
                    if (th == null) {
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str2, "GoogleMlKit scanner result value is null", null);
                        }
                        break;
                    } else {
                        so7 so7Var = new so7(th);
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            je9 je9Var2 = je9.f;
                            if (a4cVar3.b(je9Var2)) {
                                a4cVar3.c(je9Var2, str2, zo5.r("GoogleMlKit scanner result error ", th), so7Var);
                            }
                            break;
                        }
                    }
                }
                break;
            case 1:
                Surface surface = (Surface) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                surface.release();
                surfaceTexture.release();
                break;
            case 2:
                fe5 fe5Var = (fe5) this.b;
                cch cchVar = (cch) this.c;
                cchVar.close();
                Surface surface2 = (Surface) fe5Var.h.remove(cchVar);
                if (surface2 != null) {
                    pp5 pp5Var = fe5Var.a;
                    xg7.d((AtomicBoolean) pp5Var.b, true);
                    xg7.c((Thread) pp5Var.d);
                    pp5Var.s(surface2, true);
                }
                break;
            case 3:
                zv5 zv5Var = (zv5) this.b;
                cch cchVar2 = (cch) this.c;
                cchVar2.close();
                Surface surface3 = (Surface) zv5Var.h.remove(cchVar2);
                if (surface3 != null) {
                    xv5 xv5Var = zv5Var.a;
                    xg7.d((AtomicBoolean) xv5Var.b, true);
                    xg7.c((Thread) xv5Var.d);
                    xv5Var.s(surface3, true);
                }
                break;
            case 4:
                dee deeVar = (dee) this.b;
                r72 r72Var = (r72) this.c;
                Throwable th2 = (Throwable) obj;
                if (deeVar.Z == null) {
                    if (th2 instanceof EncodeException) {
                        deeVar.E(5);
                    } else {
                        deeVar.E(6);
                    }
                    deeVar.Z = th2;
                    deeVar.O(true);
                    r72Var.b(null);
                }
                break;
            default:
                g1j g1jVar = (g1j) this.b;
                xzi xziVar = (xzi) this.c;
                final v3j v3jVar = (v3j) obj;
                if (!(v3jVar instanceof t3j)) {
                    if (!(v3jVar instanceof u3j)) {
                        if (v3jVar instanceof q3j) {
                            yab.i0(g1jVar.i, ((n0c) g1jVar.u()).b(), 0, new f1j(v3jVar, g1jVar, xziVar, (lq4) null, 0), 2);
                        }
                        break;
                    } else {
                        g1jVar.t.updateAndGet(new IntUnaryOperator() { // from class: v0j
                            @Override // java.util.function.IntUnaryOperator
                            public final int applyAsInt(int i) {
                                sg0 sg0Var = ((u3j) v3jVar).b.c;
                                int iJ = gm0.J((sg0Var.a == 1 ? 0.0d : sg0Var.b) * 32768.0d);
                                return iJ > i ? iJ : i;
                            }
                        });
                        ghb ghbVar = ew5.b;
                        long jG = ew5.g(qe7.P(g1jVar.N.a, lw5.SECONDS));
                        long j = (((u3j) v3jVar).b.a / 1000000) + g1jVar.u;
                        mjg mjgVar2 = g1jVar.v;
                        Float fValueOf = Float.valueOf((j / jG) * 100.0f);
                        mjgVar2.getClass();
                        mjgVar2.j(null, fValueOf);
                        mjg mjgVar3 = g1jVar.w;
                        Long lValueOf = Long.valueOf(j);
                        mjgVar3.getClass();
                        mjgVar3.j(null, lValueOf);
                        if (j >= jG && (jceVar = g1jVar.e) != null) {
                            jceVar.R();
                            break;
                        }
                    }
                } else {
                    String str3 = g1jVar.h;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        je9 je9Var3 = je9.d;
                        if (a4cVar4.b(je9Var3)) {
                            a4cVar4.c(je9Var3, str3, "VideoMessage Recording. VideoRecordEvent.Start recording start", null);
                        }
                    }
                    mjg mjgVar4 = g1jVar.y;
                    uxi uxiVar = uxi.a;
                    mjgVar4.getClass();
                    mjgVar4.j(null, uxiVar);
                    break;
                }
                break;
        }
    }
}
