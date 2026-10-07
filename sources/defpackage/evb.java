package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class evb {
    public final oub a;
    public nub c;
    public boolean d;
    public boolean e;
    public final ny8 f;
    public final String b = getClass().getName();
    public final ny8 g = rx8.P(3, new dvb(this, 0));

    public evb(ny8 ny8Var, gu4 gu4Var, g19 g19Var, oub oubVar) {
        this.a = oubVar;
        this.f = ny8Var;
        e9i.j0(new fz6(n1g.v(oubVar.getState(), g19Var.f(), n09.d), new y73(this, (lq4) null, 14), 3), gu4Var);
    }

    public final void a(View view) {
        if (!view.isAttachedToWindow()) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "anchor tab view is detached, skip popup", null);
                return;
            }
            return;
        }
        nub nubVar = new nub(view, d(), f(), e());
        nubVar.k = this;
        if (!nubVar.a) {
            nubVar.a = true;
            if (view.isLaidOut() && view.isAttachedToWindow()) {
                nub.i(nubVar);
                nubVar.j(true);
            } else {
                bdc.a(view, new rda(4, view, nubVar));
            }
        }
        this.c = nubVar;
        this.a.d();
    }

    public void b(boolean z) {
        pa4 pa4Var = (pa4) this.f.getValue();
        int i = pa4.d;
        oa4 oa4Var = (oa4) this.g.getValue();
        Set set = (Set) pa4Var.b.get(Integer.valueOf(i));
        if (set != null) {
            set.remove(oa4Var);
        }
        if (this.d) {
            return;
        }
        boolean zH = h();
        oub oubVar = this.a;
        if (!zH) {
            oubVar.dismiss();
            return;
        }
        final nub nubVar = this.c;
        if (nubVar == null) {
            return;
        }
        final int i2 = 1;
        this.d = true;
        nubVar.k = null;
        oubVar.dismiss();
        dvb dvbVar = new dvb(this, 1);
        final int i3 = 0;
        if (!z) {
            nubVar.h();
            ijc ijcVar = (ijc) nubVar.i;
            if (ijcVar == null) {
                gm0.n((String) nubVar.f, "has no outline overlay view");
            } else {
                nubVar.i = null;
                FrameLayout frameLayout = (FrameLayout) nubVar.h;
                if (frameLayout != null) {
                    frameLayout.removeView(ijcVar);
                }
            }
            FrameLayout frameLayout2 = (FrameLayout) nubVar.h;
            if (frameLayout2 != null) {
                nubVar.h = null;
                ((ViewGroup) nubVar.c).removeView(frameLayout2);
            }
            nubVar.a = false;
            dvbVar.invoke();
            return;
        }
        if (nubVar.a) {
            final sfe sfeVar = new sfe();
            final sfe sfeVar2 = new sfe();
            final ja1 ja1Var = new ja1(sfeVar, sfeVar2, nubVar, dvbVar, 8);
            bvb bvbVar = (bvb) nubVar.j;
            if (bvbVar != null) {
                bvbVar.b(new af7() { // from class: mub
                    @Override // defpackage.af7
                    public final Object invoke() {
                        int i4 = i3;
                        sbi sbiVar = sbi.a;
                        ja1 ja1Var2 = ja1Var;
                        sfe sfeVar3 = sfeVar;
                        nub nubVar2 = nubVar;
                        switch (i4) {
                            case 0:
                                nubVar2.h();
                                sfeVar3.a = true;
                                ja1Var2.invoke();
                                break;
                            default:
                                ijc ijcVar2 = (ijc) nubVar2.i;
                                if (ijcVar2 == null) {
                                    gm0.n((String) nubVar2.f, "has no outline overlay view");
                                } else {
                                    nubVar2.i = null;
                                    FrameLayout frameLayout3 = (FrameLayout) nubVar2.h;
                                    if (frameLayout3 != null) {
                                        frameLayout3.removeView(ijcVar2);
                                    }
                                }
                                sfeVar3.a = true;
                                ja1Var2.invoke();
                                break;
                        }
                        return sbiVar;
                    }
                });
            } else {
                sfeVar.a = true;
            }
            ijc ijcVar2 = (ijc) nubVar.i;
            if (ijcVar2 != null) {
                ijcVar2.a(new af7() { // from class: mub
                    @Override // defpackage.af7
                    public final Object invoke() {
                        int i4 = i2;
                        sbi sbiVar = sbi.a;
                        ja1 ja1Var2 = ja1Var;
                        sfe sfeVar3 = sfeVar2;
                        nub nubVar2 = nubVar;
                        switch (i4) {
                            case 0:
                                nubVar2.h();
                                sfeVar3.a = true;
                                ja1Var2.invoke();
                                break;
                            default:
                                ijc ijcVar3 = (ijc) nubVar2.i;
                                if (ijcVar3 == null) {
                                    gm0.n((String) nubVar2.f, "has no outline overlay view");
                                } else {
                                    nubVar2.i = null;
                                    FrameLayout frameLayout3 = (FrameLayout) nubVar2.h;
                                    if (frameLayout3 != null) {
                                        frameLayout3.removeView(ijcVar3);
                                    }
                                }
                                sfeVar3.a = true;
                                ja1Var2.invoke();
                                break;
                        }
                        return sbiVar;
                    }
                });
            } else {
                sfeVar2.a = true;
                ja1Var.invoke();
            }
        }
    }

    public abstract View c();

    public abstract ViewGroup d();

    public abstract wub e();

    public abstract ynh f();

    public long g() {
        return 300L;
    }

    public final boolean h() {
        nub nubVar = this.c;
        return nubVar != null && nubVar.a;
    }

    public abstract void i();

    public void j() {
        if (h()) {
            nub nubVar = this.c;
            if (nubVar != null) {
                ijc ijcVar = (ijc) nubVar.i;
                if (ijcVar != null) {
                    ijcVar.setVisibility(8);
                }
                nubVar.h();
            }
            n7j.c(c(), g(), new lh9(17, this));
        }
    }

    public abstract void k();

    public abstract boolean l();
}
