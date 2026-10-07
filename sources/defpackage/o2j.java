package defpackage;

import android.view.View;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class o2j implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ o2j(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x012b  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fh2 fh2VarV;
        b99 b99VarU;
        Integer num;
        Object value;
        wxi wxiVar;
        boolean z = true;
        switch (this.a) {
            case 0:
                p0m.a(view, lt7.CONFIRM);
                VideoMessageWidget videoMessageWidget = this.b;
                zv8[] zv8VarArr = VideoMessageWidget.B;
                g1j g1jVar = videoMessageWidget.y1().c;
                if (g1jVar.F != null) {
                    fee feeVar = g1jVar.F;
                    if (feeVar == null || !feeVar.a.get()) {
                        fee feeVar2 = g1jVar.F;
                        final int i = 0;
                        if (feeVar2 != null) {
                            if (feeVar2.a.get()) {
                                ore.k("The recording has been stopped.");
                                return;
                            }
                            final dee deeVar = feeVar2.b;
                            synchronized (deeVar.j) {
                                try {
                                    if (dee.t(feeVar2, deeVar.q) || dee.t(feeVar2, deeVar.p)) {
                                        int iOrdinal = deeVar.m.ordinal();
                                        if (iOrdinal != 0) {
                                            if (iOrdinal == 1) {
                                                deeVar.H(cee.c);
                                            } else if (iOrdinal != 3) {
                                                if (iOrdinal == 4) {
                                                    deeVar.H(cee.f);
                                                    final qi0 qi0Var = deeVar.p;
                                                    deeVar.e.execute(new Runnable() { // from class: tde
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i2 = i;
                                                            qi0 qi0Var2 = qi0Var;
                                                            dee deeVar2 = deeVar;
                                                            switch (i2) {
                                                                case 0:
                                                                    deeVar2.x(qi0Var2);
                                                                    break;
                                                                default:
                                                                    if (deeVar2.s == qi0Var2 && !deeVar2.t) {
                                                                        if (deeVar2.r()) {
                                                                            deeVar2.J.l();
                                                                        }
                                                                        m86 m86Var = deeVar2.H;
                                                                        if (m86Var == null) {
                                                                            deeVar2.h0 = true;
                                                                        } else {
                                                                            m86Var.l();
                                                                            qi0 qi0Var3 = deeVar2.s;
                                                                            qi0Var3.A(new s3j(qi0Var3.h, deeVar2.n()), true);
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                            }
                                        }
                                        throw new IllegalStateException("Called pause() from invalid state: " + deeVar.m);
                                    }
                                    tvj.a("Recorder", "pause() called on a recording that is no longer active: " + feeVar2.d);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        wf2 wf2Var = g1jVar.K;
                        if (wf2Var == null) {
                            ore.p("Required value was null.");
                            return;
                        }
                        if (g1jVar.t() == null) {
                            fh2VarV = g1jVar.v();
                        } else {
                            nf2 nf2VarT = g1jVar.t();
                            if (nf2VarT == null || ((r97) nf2VarT).a.j() != 0) {
                                ((zxi) g1jVar.k.getValue()).a = true;
                                fh2VarV = fh2.b;
                            } else {
                                ((zxi) g1jVar.k.getValue()).a = false;
                                fh2VarV = fh2.c;
                            }
                            if (fh2VarV == null) {
                                fh2VarV = g1jVar.v();
                            }
                        }
                        g1jVar.p(wf2Var, fh2VarV);
                        fee feeVar3 = g1jVar.F;
                        if (feeVar3 != null) {
                            if (feeVar3.a.get()) {
                                ore.k("The recording has been stopped.");
                                return;
                            }
                            final dee deeVar2 = feeVar3.b;
                            synchronized (deeVar2.j) {
                                try {
                                    if (dee.t(feeVar3, deeVar2.q) || dee.t(feeVar3, deeVar2.p)) {
                                        int iOrdinal2 = deeVar2.m.ordinal();
                                        if (iOrdinal2 != 0) {
                                            if (iOrdinal2 == 5) {
                                                deeVar2.H(cee.e);
                                                final qi0 qi0Var2 = deeVar2.p;
                                                eif eifVar = deeVar2.e;
                                                final boolean z2 = z ? 1 : 0;
                                                eifVar.execute(new Runnable() { // from class: tde
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i2 = z2;
                                                        qi0 qi0Var3 = qi0Var2;
                                                        dee deeVar3 = deeVar2;
                                                        switch (i2) {
                                                            case 0:
                                                                deeVar3.x(qi0Var3);
                                                                break;
                                                            default:
                                                                if (deeVar3.s == qi0Var3 && !deeVar3.t) {
                                                                    if (deeVar3.r()) {
                                                                        deeVar3.J.l();
                                                                    }
                                                                    m86 m86Var = deeVar3.H;
                                                                    if (m86Var == null) {
                                                                        deeVar3.h0 = true;
                                                                    } else {
                                                                        m86Var.l();
                                                                        qi0 qi0Var4 = deeVar3.s;
                                                                        qi0Var4.A(new s3j(qi0Var4.h, deeVar3.n()), true);
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                            } else if (iOrdinal2 == 2) {
                                                deeVar2.H(cee.b);
                                            } else if (iOrdinal2 != 3) {
                                            }
                                        }
                                        throw new IllegalStateException("Called resume() from invalid state: " + deeVar2.m);
                                    }
                                    tvj.a("Recorder", "resume() called on a recording that is no longer active: " + feeVar3.d);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        mjg mjgVar = g1jVar.D;
                        nf2 nf2VarT2 = g1jVar.t();
                        boolean zM = nf2VarT2 != null ? ((ja) nf2VarT2).b.m() : false;
                        nf2 nf2VarT3 = g1jVar.t();
                        wxi wxiVar2 = new wxi(zM, (nf2VarT3 == null || (b99VarU = ((ja) nf2VarT3).b.u()) == null || (num = (Integer) b99VarU.d()) == null || num.intValue() != 1) ? false : true);
                        mjgVar.getClass();
                        mjgVar.j(null, wxiVar2);
                        return;
                    }
                    return;
                }
                return;
            default:
                p0m.a(view, lt7.CONFIRM);
                VideoMessageWidget videoMessageWidget2 = this.b;
                zv8[] zv8VarArr2 = VideoMessageWidget.B;
                g1j g1jVar2 = videoMessageWidget2.y1().c;
                wxi wxiVar3 = (wxi) g1jVar2.E.a.getValue();
                if (wxiVar3.a) {
                    o09 o09Var = g1jVar2.r;
                    be2 be2VarR = o09Var != null ? o09Var.r() : null;
                    if (be2VarR != null) {
                        ((ia) be2VarR).j(!wxiVar3.b);
                    }
                    mjg mjgVar2 = g1jVar2.D;
                    do {
                        value = mjgVar2.getValue();
                        wxiVar = (wxi) value;
                    } while (!mjgVar2.h(value, new wxi(wxiVar.a, !wxiVar.b)));
                    return;
                }
                return;
        }
    }
}
