package defpackage;

import android.os.Process;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.concurrent.ScheduledFuture;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.impl.service.VoIpCallService;
import one.me.devmenu.DevMenuScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.HardwareVideoEncoder;
import org.webrtc.HardwareVideoEncoderV2;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VpxDecoderWrapper;
import ru.ok.tamtam.messages.scheduled.SliderLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ai implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ai(y8j y8jVar, int i, DevMenuScreen devMenuScreen) {
        this.a = 9;
        this.c = y8jVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View childAt;
        ScheduledFuture scheduledFuture;
        m86 m86Var;
        switch (this.a) {
            case 0:
                int i = this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(i);
                runnable.run();
                break;
            case 1:
                v2a v2aVar = (v2a) this.c;
                int i2 = this.b;
                ob0 ob0Var = (ob0) v2aVar.c;
                String str = vqi.a;
                ob0Var.f(i2);
                break;
            case 2:
                e41 e41Var = (e41) this.c;
                int i3 = this.b;
                int i4 = e41Var.l;
                if (i4 != i3) {
                    int i5 = e41Var.h;
                    e41Var.l = (i3 / i5) * i5;
                    StringBuilder sbY = zo5.y(i4, "Update buffer size from ", " to ");
                    sbY.append(e41Var.l);
                    tvj.a("BufferedAudioStream", sbY.toString());
                    break;
                }
                break;
            case 3:
                ((bz1) this.c).y(this.b, "submitList");
                break;
            case 4:
                int i6 = this.b;
                CallServiceImpl callServiceImpl = (CallServiceImpl) this.c;
                if (i6 == callServiceImpl.f) {
                    x02 x02VarF = callServiceImpl.i().f();
                    if (x02VarF == null || !x02VarF.C()) {
                        callServiceImpl.stopForeground(1);
                        callServiceImpl.stopSelfResult(i6);
                    }
                    break;
                } else {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "CallServiceTag", qt4.l("finishService skipped: startId=", callServiceImpl.f, i6, " is newer than result="), null);
                        }
                        break;
                    }
                }
                break;
            case 5:
                ((zc2) this.c).a(this.b);
                break;
            case 6:
                ad2 ad2Var = (ad2) this.c;
                int i7 = this.b;
                hjd hjdVar = (hjd) ((js8) ad2Var.b).a;
                if (hjdVar != null) {
                    hjdVar.a(i7);
                }
                break;
            case 7:
                g45 g45Var = (g45) this.c;
                int i8 = this.b;
                RecyclerView recyclerView = g45Var.s;
                ((SliderLayoutManager) recyclerView.getLayoutManager()).p1(i8, g45Var.B);
                recyclerView.post(new e45(g45Var, 2));
                break;
            case 8:
                y55 y55Var = (y55) this.c;
                int i9 = this.b;
                VpxDecoderWrapper vpxDecoderWrapper = y55Var.a;
                vpxDecoderWrapper.init(VpxDecoderWrapper.DecoderKind.values()[qt4.D(i9)]);
                vpxDecoderWrapper.setFrameHandler(y55Var);
                vpxDecoderWrapper.setErrorCallback(y55Var);
                vpxDecoderWrapper.setDesiredFps(10);
                break;
            case 9:
                y8j y8jVar = (y8j) this.c;
                int i10 = this.b;
                nee adapter = y8jVar.getAdapter();
                int iL = adapter != null ? adapter.l() : 0;
                for (int i11 = 0; i11 < iL; i11++) {
                    if (i11 != i10) {
                        View childAt2 = y8jVar.getChildAt(0);
                        RecyclerView recyclerView2 = childAt2 instanceof RecyclerView ? (RecyclerView) childAt2 : null;
                        if (recyclerView2 != null && (childAt = recyclerView2.getChildAt(i11)) != null) {
                            DevMenuScreen.o1(childAt);
                        }
                    }
                }
                break;
            case 10:
                k86 k86Var = (k86) this.c;
                int i12 = this.b;
                boolean z = k86Var.j;
                m86 m86Var2 = k86Var.l;
                if (!z) {
                    switch (qt4.D(m86Var2.F)) {
                        case 0:
                        case 7:
                        case 8:
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            m86Var2.k.offer(Integer.valueOf(i12));
                            m86Var2.c();
                            break;
                        default:
                            ore.k("Unknown state: ".concat(x05.r(m86Var2.F)));
                            break;
                    }
                } else {
                    tvj.g(m86Var2.a, "Receives input frame after codec is reset.");
                    break;
                }
                break;
            case 11:
                ((l96) this.c).N0(this.b + 1);
                break;
            case 12:
                kg6 kg6Var = (kg6) this.c;
                int i13 = this.b;
                r75 r75Var = kg6Var.x;
                wf wfVarT = r75Var.t();
                r75Var.y(wfVarT, 1034, new b75(wfVarT, i13, 1));
                break;
            case 13:
                ((HardwareVideoEncoder) this.c).lambda$deliverEncodedImage$0(this.b);
                break;
            case 14:
                ((HardwareVideoEncoderV2) this.c).lambda$deliverEncodedImage$7(this.b);
                break;
            case 15:
                jv9 jv9Var = (jv9) this.c;
                int i14 = this.b;
                pw pwVar = jv9Var.k;
                pwVar.remove(Integer.valueOf(i14));
                jv9Var.l.delete(i14);
                xnf xnfVar = jv9Var.n;
                if (xnfVar != null && xnfVar.a.e() < 5 && pwVar.isEmpty()) {
                    jv9Var.m.postDelayed(new ev9(jv9Var, 1), 500L);
                    break;
                }
                break;
            case 16:
                ((tha) this.c).n(this.b);
                break;
            case 17:
                ((tda) this.c).f(this.b);
                break;
            case 18:
                dee deeVar = (dee) this.c;
                int i15 = this.b;
                int i16 = deeVar.n0;
                deeVar.n0 = i15;
                if (i16 == i15) {
                    tvj.a("Recorder", "Video source transitions to the same state: ".concat(ewi.r(i15)));
                    break;
                } else {
                    tvj.a("Recorder", "Video source has transitioned to state: ".concat(ewi.r(i15)));
                    if (i15 == 3) {
                        if (deeVar.D == null) {
                            bee beeVar = deeVar.i0;
                            if (beeVar != null) {
                                if (!beeVar.d) {
                                    beeVar.d = true;
                                    ScheduledFuture scheduledFuture2 = beeVar.f;
                                    if (scheduledFuture2 != null) {
                                        scheduledFuture2.cancel(false);
                                        beeVar.f = null;
                                    }
                                }
                                deeVar.i0 = null;
                            }
                            deeVar.z(false);
                            break;
                        } else {
                            deeVar.c0 = true;
                            qi0 qi0Var = deeVar.s;
                            if (qi0Var != null && !qi0Var.l) {
                                deeVar.w(qi0Var, 4, null);
                                break;
                            }
                        }
                    } else if (i15 == 2 && (scheduledFuture = deeVar.b0) != null && scheduledFuture.cancel(false) && (m86Var = deeVar.H) != null) {
                        dee.v(m86Var);
                        break;
                    }
                }
                break;
            case 19:
                lue lueVar = (lue) this.c;
                int i17 = this.b;
                if (lueVar.c.get()) {
                    p09 p09Var = lueVar.a.a;
                    p09Var.w = i17;
                    u48 u48Var = p09Var.i;
                    if (u48Var.E(i17)) {
                        u48Var.O();
                    }
                    p09Var.e.N(i17);
                    bui buiVar = p09Var.j;
                    if (buiVar.E(i17)) {
                        buiVar.U();
                    }
                }
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                mue mueVar = (mue) this.c;
                int i18 = this.b;
                if (mueVar.c.get()) {
                    ((cli) mueVar.a.b).x(i18);
                }
                break;
            case 21:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                int i19 = this.b;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.u(view, i19, false);
                }
                break;
            case 22:
                ((SurfaceTextureHelper) this.c).lambda$setFrameRotation$4(this.b);
                break;
            default:
                VoIpCallService voIpCallService = (VoIpCallService) this.c;
                int i20 = this.b;
                int i21 = VoIpCallService.g;
                x02 x02VarF2 = voIpCallService.e().f();
                if (x02VarF2 == null) {
                    x02VarF2 = (x02) voIpCallService.e().i.a.getValue();
                }
                if (!x02VarF2.C()) {
                    voIpCallService.stopForeground(1);
                    voIpCallService.stopSelfResult(i20);
                }
                break;
        }
    }

    public /* synthetic */ ai(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ ai(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
