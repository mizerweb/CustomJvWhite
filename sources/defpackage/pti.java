package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class pti extends afe {
    public final long a;
    public final qpa b;
    public final lsa c;
    public final fz7 d;
    public final gu4 e;
    public final h3j f;
    public final String g;
    public RecyclerView h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final Rect q;
    public final m8b r;
    public final m8b s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final float w;
    public boolean x;
    public final ze4 y;

    public pti(ny8 ny8Var, ny8 ny8Var2, u4a u4aVar, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, long j, qpa qpaVar, lsa lsaVar, fz7 fz7Var, xhh xhhVar, v09 v09Var, h3j h3jVar) {
        ny8 ny8Var10 = u4aVar.e;
        this.a = j;
        this.b = qpaVar;
        this.c = lsaVar;
        this.d = fz7Var;
        this.e = v09Var;
        this.f = h3jVar;
        this.g = pti.class.getName();
        this.i = ny8Var;
        this.j = ny8Var2;
        this.k = ny8Var3;
        this.l = ny8Var4;
        this.m = ny8Var6;
        this.n = ny8Var7;
        this.o = ny8Var8;
        this.p = ny8Var9;
        this.q = new Rect();
        this.r = new m8b();
        this.s = new m8b();
        this.t = u4aVar.d();
        this.u = u4aVar.a && u4aVar.b().c.d.getBoolean("app.media.autoplay.gif", true);
        boolean z = ((Number) ny8Var10.getValue()).intValue() == 1;
        this.v = z;
        this.w = z ? 1.0f : 0.6f;
        this.y = new ze4(((Number) ny8Var10.getValue()).intValue(), this);
        e9i.j0(new fz6(((n5j) ny8Var2.getValue()).j.k, new dyd(2, this, pti.class, "handleFetchEvents", "handleFetchEvents(Lone/me/sdk/media/player/fetcher/VideoFetchEvent;)V", 4, 19), 3), v09Var);
        e9i.j0(new fz6(e9i.m0(new ra1(22, new hde(((tyi) ny8Var4.getValue()).p, 16)), ((tyi) ny8Var4.getValue()).r), new hpf(this, null, 18), 3), v09Var);
        e9i.j0(new fz6(((j0j) ny8Var5.getValue()).b, new jyf(this, ny8Var2, (lq4) null, 11), 3), v09Var);
        n0c n0cVar = (n0c) xhhVar;
        e9i.j0(e9i.T(new fz6(e9i.T(new hde(((b2a) ny8Var8.getValue()).y, 15), n0cVar.a()), new j8g(this, (lq4) null, 25), 3), n0cVar.c()), v09Var);
    }

    @Override // defpackage.afe
    public final void a(RecyclerView recyclerView, int i) {
        if (i != 0) {
            return;
        }
        h(recyclerView, false);
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.h = recyclerView;
        d(recyclerView);
    }

    public final void c(e3j e3jVar, String str) {
        z5j z5jVar;
        e3jVar.clear();
        ((y3d) this.i.getValue()).a(e3jVar);
        lti ltiVar = (lti) this.y.e(str);
        if (ltiVar == null || (z5jVar = (z5j) ltiVar.f.get()) == null) {
            return;
        }
        z5jVar.J();
    }

    public final void d(RecyclerView recyclerView) {
        u40 u40Var;
        je9 je9Var = je9.d;
        if (this.t) {
            LinearLayoutManager linearLayoutManagerE0 = tre.e0(recyclerView);
            int iX0 = linearLayoutManagerE0 != null ? linearLayoutManagerE0.X0() : -1;
            int iZ0 = linearLayoutManagerE0 != null ? linearLayoutManagerE0.Z0() : -1;
            if (iX0 == -1 || iZ0 == -1) {
                String str = this.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, nbh.u("Player autoplay. Can't start fetch because invalid positions, first:", iX0, ", last:", iZ0, "."), null);
                    return;
                }
                return;
            }
            if (iX0 <= iZ0) {
                int i = iX0;
                while (true) {
                    lfe lfeVarK = recyclerView.K(i);
                    if (lfeVarK == null) {
                        String str2 = this.g;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            StringBuilder sbP = qv1.p("Player autoplay. Can't find viewHolder for fetch, pos:", i, ", firstPos:", iX0, "|lastPos:");
                            sbP.append(iZ0);
                            a4cVar2.c(je9Var, str2, sbP.toString(), null);
                        }
                    } else if (lfeVarK instanceof tea) {
                        tea teaVar = (tea) lfeVarK;
                        if (teaVar.y instanceof z5j) {
                            MessageModel messageModelH = this.b.h(teaVar.A);
                            t50 t50Var = (messageModelH == null || (u40Var = messageModelH.j) == null) ? null : u40Var.b;
                            hti htiVar = t50Var instanceof hti ? (hti) t50Var : null;
                            if (htiVar != null) {
                                if (!htiVar.c()) {
                                    String str3 = this.g;
                                    a4c a4cVar3 = gm0.f;
                                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                                        a4cVar3.c(je9Var, str3, nbh.s(messageModelH.a, "Player autoplay. Don't fetch video for videoAttach, msgId:", " because it's not ready to autoplay"), null);
                                    }
                                } else if ((htiVar instanceof oxi) || ((htiVar instanceof eag) && ((eag) htiVar).c.l)) {
                                    this.s.a(htiVar.l());
                                } else {
                                    this.r.a(htiVar.l());
                                }
                            }
                        }
                    }
                    if (i == iZ0) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (this.s.j()) {
                ((tyi) this.l.getValue()).b(this.a, rx8.f0(this.s));
                this.s.c();
            }
            if (this.r.j()) {
                ((n5j) this.j.getValue()).b(this.a, "video_fetching_autoplay", rx8.f0(this.r));
                this.r.c();
            }
        }
    }

    public final void e() {
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Player autoplay. onMediaProcessingStarted.", null);
            }
        }
        this.x = true;
        if (((d4d) this.k.getValue()).a) {
            return;
        }
        this.y.i(-1);
    }

    public final void f(z5j z5jVar, lti ltiVar, t50 t50Var, MessageModel messageModel, e3j e3jVar, rui ruiVar) {
        boolean z = (messageModel.m == null && messageModel.n == null && (messageModel.B == null || (messageModel.F & (-2080374787)) == 0)) ? false : true;
        long j = messageModel.a;
        ny8 ny8Var = this.m;
        z5jVar.D(ltiVar, t50Var, j, z, !((Boolean) ((e5d) ny8Var.getValue()).x().i()).booleanValue());
        z5jVar.setVideoClickListener(new km4(this, ltiVar, e3jVar, ruiVar, 1));
        if (((Boolean) ((e5d) ny8Var.getValue()).x().i()).booleanValue()) {
            e3jVar.q0(new um7(z5jVar, e3jVar, 2));
        }
        z5jVar.setVideoLongClickListener(new s81(28, this));
        e3jVar.o0(true);
        e3jVar.b(0.0f);
        e3j.w(e3jVar, ruiVar, true, d3j.BUBBLE, 0.0f, 120);
    }

    public final void g(tea teaVar, z5j z5jVar, h8g h8gVar, MessageModel messageModel, rm7 rm7Var) {
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                long j = h8gVar.a;
                String str2 = h8gVar.b;
                int iG = this.y.g();
                StringBuilder sbT = qt4.t(j, "Player autoplay. State doesn't exist,\n                            |msgId:", ",\n                            |attachId:", str2);
                sbT.append("\n                            |states count:");
                sbT.append(iG);
                a4cVar.c(je9Var, str, s5h.y0(sbT.toString()), null);
            }
        }
        e3j e3jVar = ((y3d) this.i.getValue()).get();
        lti ltiVar = new lti(h8gVar.b, teaVar.A, e3jVar, (y3d) this.i.getValue(), rm7Var, new WeakReference(z5jVar), this.y, true, (e5d) this.m.getValue(), (et3) this.n.getValue());
        this.y.d(h8gVar.b, ltiVar);
        f(z5jVar, ltiVar, h8gVar, messageModel, e3jVar, rm7Var);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [q1i] */
    public final void h(RecyclerView recyclerView, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        ?? r4;
        boolean z3;
        e3j e3jVar;
        z5j z5jVar;
        u40 u40Var;
        int i5;
        e3j e3jVar2;
        z5j z5jVar2;
        z5j z5jVar3;
        u40 u40Var2;
        q1i q1iVar;
        pti ptiVar = this;
        RecyclerView recyclerView2 = recyclerView;
        je9 je9Var = je9.d;
        ptiVar.h = recyclerView2;
        Throwable th = null;
        if (ptiVar.x) {
            String str = ptiVar.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Player autoplay. Can't start autoplay because media transform is ongoing.", null);
                return;
            }
            return;
        }
        LinearLayoutManager linearLayoutManagerE0 = tre.e0(recyclerView2);
        int iX0 = linearLayoutManagerE0 != null ? linearLayoutManagerE0.X0() : -1;
        int iZ0 = linearLayoutManagerE0 != null ? linearLayoutManagerE0.Z0() : -1;
        if (iX0 == -1 || iZ0 == -1) {
            int i6 = iX0;
            int i7 = iZ0;
            String str2 = ptiVar.g;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, nbh.u("Player autoplay. Can't start autoplay because invalid positions, first:", i6, ", last:", i7, "."), null);
                return;
            }
            return;
        }
        if (iX0 > iZ0) {
            return;
        }
        int i8 = iX0;
        while (true) {
            lfe lfeVarK = recyclerView2.K(i8);
            if (lfeVarK == null) {
                String str3 = ptiVar.g;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    StringBuilder sbP = qv1.p("Player autoplay. Can't find viewHolder, pos:", i8, ", firstPos:", iX0, "|lastPos:");
                    sbP.append(iZ0);
                    a4cVar3.c(je9Var, str3, sbP.toString(), th);
                }
                i = iX0;
                i4 = iZ0;
                i3 = i8;
            } else {
                if (lfeVarK instanceof tea) {
                    tea teaVar = (tea) lfeVarK;
                    ViewParent viewParent = teaVar.y;
                    if (viewParent instanceof z5j) {
                        boolean z4 = true;
                        if (z) {
                            z2 = true;
                        } else {
                            View previewView = ((z5j) viewParent).getPreviewView();
                            if (previewView == null) {
                                previewView = teaVar.y;
                            }
                            Rect rect = ptiVar.q;
                            if (!previewView.getLocalVisibleRect(rect) || rect.height() < previewView.getMeasuredHeight() * ptiVar.w) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        }
                        boolean z5 = ((z5j) teaVar.y).z();
                        ViewParent viewParent2 = teaVar.y;
                        if (viewParent2 instanceof q1i) {
                            q1iVar = (q1i) viewParent2;
                        } else {
                            r4 = th;
                        }
                        if (r4 == 0 || !r4.q()) {
                            r4 = q1iVar;
                            r4 = q1iVar;
                            z4 = false;
                        }
                        r4 = q1iVar;
                        if (!z2 || !ptiVar.t || z5 || z4) {
                            boolean z6 = z2;
                            i = iX0;
                            i2 = iZ0;
                            int i9 = i8;
                            if (z6 && ptiVar.u && z5) {
                                z5j z5jVar4 = (z5j) teaVar.y;
                                MessageModel messageModelH = ptiVar.b.h(teaVar.A);
                                t50 t50Var = (messageModelH == null || (u40Var = messageModelH.j) == null) ? null : u40Var.b;
                                h8g h8gVar = t50Var instanceof h8g ? (h8g) t50Var : null;
                                if (h8gVar == null) {
                                    String str4 = ptiVar.g;
                                    a4c a4cVar4 = gm0.f;
                                    if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                                        a4cVar4.c(je9Var, str4, "Player autoplay. Can't find imageAttach, msgId:" + (messageModelH != null ? Long.valueOf(messageModelH.a) : null), null);
                                    }
                                } else {
                                    Uri uri = h8gVar.c.l;
                                    if (uri == null) {
                                        String str5 = ptiVar.g;
                                        a4c a4cVar5 = gm0.f;
                                        if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                                            a4cVar5.c(je9Var, str5, s5h.y0("Player autoplay. Can't find video content,\n                                |msgId:" + h8gVar.a + ",\n                                |attachId:" + h8gVar.b), null);
                                        }
                                    } else {
                                        lti ltiVar = (lti) ptiVar.y.c(h8gVar.b);
                                        if (ltiVar != null) {
                                            e3j e3jVar3 = ltiVar.c;
                                            String str6 = ptiVar.g;
                                            a4c a4cVar6 = gm0.f;
                                            if (a4cVar6 != null && a4cVar6.b(je9Var)) {
                                                long j = ltiVar.b;
                                                String str7 = ltiVar.a;
                                                boolean zN = z5jVar4.n();
                                                e3jVar = e3jVar3;
                                                boolean zB = z5jVar4.B();
                                                boolean zD = e3jVar.d();
                                                StringBuilder sbT = qt4.t(j, "Player autoplay. State already exist,\n                                |msgId:", ",\n                                |attachId:", str7);
                                                qv1.v("\n                                |hasPreview:", "\n                                |isVisible:", sbT, zN, zB);
                                                sbT.append("\n                                |playing:");
                                                sbT.append(zD);
                                                a4cVar6.c(je9Var, str6, s5h.y0(sbT.toString()), null);
                                            } else {
                                                e3jVar = e3jVar3;
                                            }
                                            if (e3jVar.d() && ((z5jVar = (z5j) ltiVar.f.get()) == null || z5jVar.n())) {
                                                ptiVar = this;
                                            } else {
                                                ptiVar = this;
                                                ptiVar.f(z5jVar4, ltiVar, h8gVar, messageModelH, e3jVar, ltiVar.e);
                                            }
                                        } else {
                                            h8g h8gVar2 = h8gVar;
                                            if (((Boolean) ((e5d) ptiVar.m.getValue()).Z5.a(e5d.S6[365]).i()).booleanValue()) {
                                                z3 = z6;
                                                yab.i0(ptiVar.e, null, 0, new gv7(this, h8gVar2, uri, teaVar, z5jVar4, messageModelH, null, 20), 3);
                                                ptiVar = this;
                                            } else {
                                                z3 = z6;
                                                g58 g58Var = h8gVar2.c;
                                                rm7 rm7Var = new rm7(uri, g58Var.c, g58Var.d, g58Var.a);
                                                ptiVar = this;
                                                ptiVar.g(teaVar, z5jVar4, h8gVar2, messageModelH, rm7Var);
                                            }
                                        }
                                    }
                                }
                                z3 = z6;
                            } else {
                                z3 = z6;
                                String str8 = ptiVar.g;
                                a4c a4cVar7 = gm0.f;
                                if (a4cVar7 != null && a4cVar7.b(je9Var)) {
                                    StringBuilder sb = new StringBuilder("Player autoplay. Don't find visible videoViewParent by this pos:");
                                    i3 = i9;
                                    sb.append(i3);
                                    sb.append(", inVisibleArea:");
                                    sb.append(z3);
                                    sb.append(", isTranscriptionExpanded: ");
                                    sb.append(z4);
                                    a4cVar7.c(je9Var, str8, sb.toString(), null);
                                }
                            }
                            i3 = i9;
                        } else {
                            z5j z5jVar5 = (z5j) teaVar.y;
                            i = iX0;
                            MessageModel messageModelH2 = ptiVar.b.h(teaVar.A);
                            t50 t50Var2 = (messageModelH2 == null || (u40Var2 = messageModelH2.j) == null) ? null : u40Var2.b;
                            hti htiVar = t50Var2 instanceof hti ? (hti) t50Var2 : null;
                            if (htiVar == null) {
                                String str9 = ptiVar.g;
                                a4c a4cVar8 = gm0.f;
                                if (a4cVar8 != null && a4cVar8.b(je9Var)) {
                                    a4cVar8.c(je9Var, str9, "Player autoplay. Can't find videoAttach, msgId:" + (messageModelH2 != null ? Long.valueOf(messageModelH2.a) : null), null);
                                }
                                z2 = z2;
                                i2 = iZ0;
                                i5 = i8;
                            } else {
                                if (htiVar.b()) {
                                    i2 = iZ0;
                                    i5 = i8;
                                    hti htiVar2 = htiVar;
                                    if (((l4d) ((b2a) ptiVar.o.getValue()).y.a.getValue()).a != messageModelH2.a) {
                                        rui ruiVarA = ((n5j) ptiVar.j.getValue()).e.a(htiVar2.k());
                                        if (ruiVarA == null) {
                                            String str10 = ptiVar.g;
                                            a4c a4cVar9 = gm0.f;
                                            if (a4cVar9 != null && a4cVar9.b(je9Var)) {
                                                a4cVar9.c(je9Var, str10, s5h.y0("Player autoplay. Can't find video content, \n                                |msgId:" + htiVar2.l() + ",\n                                |attachId:" + htiVar2.k()), null);
                                            }
                                            z2 = z2;
                                        } else {
                                            lti ltiVar2 = (lti) ptiVar.y.c(htiVar2.k());
                                            if (ltiVar2 == null) {
                                                String str11 = ptiVar.g;
                                                a4c a4cVar10 = gm0.f;
                                                if (a4cVar10 != null && a4cVar10.b(je9Var)) {
                                                    long jL = htiVar2.l();
                                                    String strK = htiVar2.k();
                                                    long jC = ruiVarA.c();
                                                    int iG = ptiVar.y.g();
                                                    StringBuilder sbT2 = qt4.t(jL, "Player autoplay. State doesn't exist, \n                                |msgId:", ", \n                                |attachId:", strK);
                                                    qt4.z(jC, "\n                                |videoPos:", "\n                                |states count:", sbT2);
                                                    sbT2.append(iG);
                                                    a4cVar10.c(je9Var, str11, s5h.y0(sbT2.toString()), null);
                                                }
                                                e3j e3jVar4 = ((y3d) ptiVar.i.getValue()).get();
                                                e3jVar4.X(new pgg(ptiVar.f));
                                                lti ltiVar3 = new lti(htiVar2.k(), teaVar.A, e3jVar4, (y3d) ptiVar.i.getValue(), ruiVarA, new WeakReference(z5jVar5), ptiVar.y, false, (e5d) ptiVar.m.getValue(), (et3) ptiVar.n.getValue());
                                                ptiVar.y.d(htiVar2.k(), ltiVar3);
                                                ptiVar.f(z5jVar5, ltiVar3, htiVar2, messageModelH2, e3jVar4, ruiVarA);
                                            } else {
                                                z2 = z2;
                                                e3j e3jVar5 = ltiVar2.c;
                                                String str12 = ptiVar.g;
                                                a4c a4cVar11 = gm0.f;
                                                if (a4cVar11 != null && a4cVar11.b(je9Var)) {
                                                    long j2 = ltiVar2.b;
                                                    String str13 = ltiVar2.a;
                                                    e3jVar2 = e3jVar5;
                                                    long jC2 = ruiVarA.c();
                                                    boolean zN2 = z5jVar5.n();
                                                    z5jVar2 = z5jVar5;
                                                    boolean zB2 = z5jVar2.B();
                                                    boolean zD2 = e3jVar2.d();
                                                    StringBuilder sbT3 = qt4.t(j2, "Player autoplay. State already exist, \n                                |msgId:", ", \n                                |attachId:", str13);
                                                    qt4.z(jC2, "\n                                |videoPos:", "\n                                |hasPreview:", sbT3);
                                                    qt4.B("\n                                |isVisible:", "\n                                |playing:", sbT3, zN2, zB2);
                                                    sbT3.append(zD2);
                                                    a4cVar11.c(je9Var, str12, s5h.y0(sbT3.toString()), null);
                                                } else {
                                                    z5jVar2 = z5jVar5;
                                                    e3jVar2 = e3jVar5;
                                                }
                                                if (e3jVar2.d() && ((z5jVar3 = (z5j) ltiVar2.f.get()) == null || z5jVar3.n())) {
                                                    ptiVar = this;
                                                } else {
                                                    ptiVar = this;
                                                    ptiVar.f(z5jVar2, ltiVar2, htiVar2, messageModelH2, e3jVar2, ruiVarA);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i2 = iZ0;
                                    i5 = i8;
                                }
                                z2 = z2;
                                String str14 = ptiVar.g;
                                a4c a4cVar12 = gm0.f;
                                if (a4cVar12 != null && a4cVar12.b(je9Var)) {
                                    a4cVar12.c(je9Var, str14, nbh.s(messageModelH2.a, "Player autoplay. Don't play videoAttach, msgId:", " because it's not ready to autoplay"), null);
                                }
                            }
                            i3 = i5;
                            z3 = z2;
                        }
                        if (ptiVar.v && ptiVar.y.g() > 0 && z3 && !z) {
                            return;
                        }
                    } else {
                        i = iX0;
                        i2 = iZ0;
                        i3 = i8;
                    }
                } else {
                    i = iX0;
                    i2 = iZ0;
                    i3 = i8;
                }
                i4 = i2;
            }
            if (i3 == i4) {
                return;
            }
            i8 = i3 + 1;
            recyclerView2 = recyclerView;
            iZ0 = i4;
            iX0 = i;
            th = null;
        }
    }
}
