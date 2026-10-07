package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.HardwareVideoEncoderFactory;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class fwg {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public fwg(mkc mkcVar) {
        this.a = 1;
        this.e = (lb9) mkcVar.e;
        CidLogger cidLogger = (CidLogger) mkcVar.b;
        this.d = cidLogger;
        this.c = (opb) mkcVar.c;
        cidLogger.log("OKRTCSvcFactory", "Is VIDEO HW acceleration enabled ? ".concat(!uza.a ? "yes" : "no"));
        cidLogger.log("OKRTCSvcFactory", "Is Camera2 API enabled ? " + mkcVar.a);
        this.b = mkcVar.a;
        this.i = (Context) mkcVar.f;
        this.f = new b72(cidLogger);
        this.g = new b1k(cidLogger);
        this.h = new zu4(3);
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.clear();
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.addAll((List) mkcVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x013e A[Catch: IllegalArgumentException -> 0x015d, TryCatch #1 {IllegalArgumentException -> 0x015d, blocks: (B:23:0x0079, B:26:0x0083, B:28:0x008e, B:46:0x00ef, B:66:0x0120, B:67:0x0125, B:72:0x013e, B:73:0x0145, B:60:0x010a, B:32:0x00a3, B:34:0x00b5, B:37:0x00bd, B:39:0x00c8, B:43:0x00dc, B:57:0x0102), top: B:81:0x0079, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [org.webrtc.CameraVideoCapturer] */
    /* JADX WARN: Type inference failed for: r16v4 */
    public kd2 a(eg2 eg2Var) {
        kd2 kd2Var;
        Object obj;
        boolean z;
        boolean z2;
        ?? CreateCapturer;
        Object obj2;
        ArrayList arrayList;
        int i;
        zu4 zu4Var = (zu4) this.h;
        b1k b1kVar = (b1k) this.g;
        b72 b72Var = (b72) this.f;
        Object obj3 = this.d;
        CidLogger cidLogger = (CidLogger) obj3;
        Context context = (Context) this.i;
        try {
            StringBuilder sb = new StringBuilder("creating camera capturer adapter using camera api ");
            sb.append(this.b ? 2 : 1);
            cidLogger.log("OKRTCSvcFactory", sb.toString());
            if (eg2Var != null && (i = eg2Var.a) != 3) {
                cidLogger.log("OKRTCSvcFactory", "requested initial facing is ".concat(bc1.x(i)));
            }
            wa2 wa2Var = (!this.b || context == null) ? new wa2(cidLogger, !uza.a) : new wa2(context, cidLogger);
            Iterator it = wa2Var.E().iterator();
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str = null;
            String str2 = null;
            while (true) {
                if (!it.hasNext()) {
                    obj = obj3;
                    kd2Var = null;
                    break;
                }
                kd2Var = null;
                try {
                    jf2 jf2Var = (jf2) it.next();
                    if (jf2Var instanceof hf2) {
                        if (arrayList2 != null) {
                            obj = obj3;
                        } else if (((hf2) jf2Var).b.isEmpty()) {
                            obj = obj3;
                            cidLogger.reportException("OKRTCSvcFactory", "camera.enumerator.npe.front", new RuntimeException("No supported formats for front camera"));
                        } else {
                            arrayList2 = new ArrayList(((hf2) jf2Var).b);
                            str2 = ((hf2) jf2Var).a;
                            if (arrayList3 != null) {
                                obj = obj3;
                                break;
                            }
                        }
                        obj3 = obj;
                    } else {
                        obj = obj3;
                        if ((jf2Var instanceof gf2) && arrayList3 == null) {
                            if (!((gf2) jf2Var).b.isEmpty()) {
                                arrayList3 = new ArrayList(((gf2) jf2Var).b);
                                str = ((gf2) jf2Var).a;
                                if (arrayList2 != null) {
                                    break;
                                }
                            } else {
                                cidLogger.reportException("OKRTCSvcFactory", "camera.enumeratore.npe.back", new RuntimeException("No supported formats for back camera"));
                            }
                        }
                        obj3 = obj;
                    }
                } catch (IllegalArgumentException unused) {
                    cidLogger.log("OKRTCSvcFactory", "IAE @ camera enumeration");
                }
            }
            if (eg2Var != null) {
                z = true;
                if (eg2Var.a != 1) {
                    z2 = false;
                }
                if (!z2) {
                    str2 = str;
                }
                if (str2 != null) {
                    try {
                        CreateCapturer = wa2Var.createCapturer(str2, b72Var, b1kVar, zu4Var);
                    } catch (Exception e) {
                        cidLogger.reportException("OKRTCSvcFactory", "camera.enumerator.create", new RuntimeException("Cant create front camera capturer", e));
                        CreateCapturer = kd2Var;
                    }
                } else {
                    CreateCapturer = kd2Var;
                }
                obj2 = this.c;
                if (CreateCapturer == 0 && arrayList2 != null) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList(arrayList2);
                    }
                    return new kd2((opb) obj2, CreateCapturer, wa2Var, arrayList2, arrayList3, z2, (CidLogger) obj);
                }
                arrayList = arrayList2;
                if (arrayList3 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(arrayList3);
                    }
                    return new kd2((opb) obj2, wa2Var.createCapturer(str, b72Var, b1kVar, zu4Var), wa2Var, arrayList, arrayList3, false, (CidLogger) obj);
                }
                cidLogger.reportException("OKRTCSvcFactory", "camera.enumerator.null", new RuntimeException("Cant find camera capturer"));
                return kd2Var;
            }
            z = true;
            z2 = z;
            if (!z2) {
                str2 = str;
            }
            if (str2 != null) {
                CreateCapturer = wa2Var.createCapturer(str2, b72Var, b1kVar, zu4Var);
            } else {
                CreateCapturer = kd2Var;
            }
            obj2 = this.c;
            if (CreateCapturer == 0) {
            }
            arrayList = arrayList2;
            if (arrayList3 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList(arrayList3);
                }
                return new kd2((opb) obj2, wa2Var.createCapturer(str, b72Var, b1kVar, zu4Var), wa2Var, arrayList, arrayList3, false, (CidLogger) obj);
            }
        } catch (IllegalArgumentException unused2) {
            kd2Var = null;
        }
        cidLogger.reportException("OKRTCSvcFactory", "camera.enumerator.null", new RuntimeException("Cant find camera capturer"));
        return kd2Var;
    }

    public void b(rcc rccVar, ViewGroup viewGroup, boolean z) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.g;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = (ViewPropertyAnimator) this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        float f = z ? 1.0f : 0.0f;
        if (!rccVar.isAttachedToWindow()) {
            String name = fwg.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "toolbar is not attached", null);
                return;
            }
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = rccVar.animate().alpha(f).setDuration(300L).withEndAction(new dwg(this, 1));
        this.g = viewPropertyAnimatorWithEndAction;
        if (viewPropertyAnimatorWithEndAction != null) {
            viewPropertyAnimatorWithEndAction.start();
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction2 = viewGroup.animate().alpha(f).setDuration(300L).withEndAction(new dwg(this, 2));
        this.h = viewPropertyAnimatorWithEndAction2;
        if (viewPropertyAnimatorWithEndAction2 != null) {
            viewPropertyAnimatorWithEndAction2.start();
        }
    }

    public void c() {
        xgh xghVar = (xgh) this.c;
        y8j y8jVar = (y8j) this.d;
        if (this.b) {
            ore.k("TabLayoutMediator is already attached");
            return;
        }
        nee adapter = y8jVar.getAdapter();
        this.f = adapter;
        if (adapter == null) {
            ore.k("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.b = true;
        zgh zghVar = new zgh(xghVar);
        this.g = zghVar;
        y8jVar.e(zghVar);
        xdb xdbVar = new xdb(2, y8jVar);
        this.h = xdbVar;
        xghVar.a(xdbVar);
        aj3 aj3Var = new aj3(3, this);
        this.i = aj3Var;
        ((nee) this.f).C(aj3Var);
        e();
        xghVar.o(y8jVar.getCurrentItem(), 0.0f, true, true, true);
    }

    public void d() {
        nee neeVar = (nee) this.f;
        if (neeVar != null) {
            neeVar.E((aj3) this.i);
            this.i = null;
        }
        ((xgh) this.c).k((xdb) this.h);
        ((y8j) this.d).j((zgh) this.g);
        this.h = null;
        this.g = null;
        this.f = null;
        this.b = false;
    }

    public void e() {
        xgh xghVar = (xgh) this.c;
        xghVar.j();
        nee neeVar = (nee) this.f;
        if (neeVar != null) {
            int iL = neeVar.l();
            for (int i = 0; i < iL; i++) {
                ugh ughVarI = xghVar.i();
                ((ygh) this.e).b(ughVarI, i);
                xghVar.b(ughVarI, xghVar.b.size(), false);
            }
            if (iL > 0) {
                int iMin = Math.min(((y8j) this.d).getCurrentItem(), xghVar.getTabCount() - 1);
                if (iMin != xghVar.getSelectedTabPosition()) {
                    xghVar.n(xghVar.h(iMin), true);
                }
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return uza.b(this);
            default:
                return super.toString();
        }
    }

    public fwg() {
        this.a = 0;
        this.c = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);
        this.d = new PathInterpolator(0.33f, 0.0f, 0.51f, 1.0f);
    }

    public fwg(xgh xghVar, y8j y8jVar, ygh yghVar) {
        this.a = 2;
        this.c = xghVar;
        this.d = y8jVar;
        this.e = yghVar;
    }
}
