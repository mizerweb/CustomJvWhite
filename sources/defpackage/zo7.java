package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.Size;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import com.google.android.gms.common.internal.a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zo7 implements oca, fr0, rg4, t65, cj1, gq3, btb, kg7, q5j, mf7, jg7, zs3 {
    public static zo7 c;
    public final /* synthetic */ int a;
    public final Object b;

    public zo7(int i) {
        this.a = i;
        switch (i) {
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                this.b = new CopyOnWriteArraySet();
                return;
            case 21:
            case 22:
            default:
                this.b = ww3.T1(i43.d);
                return;
            case 23:
                long jRandom = (long) (Math.random() * 9.223372036854776E18d);
                this.b = new int[np0.o];
                List listT1 = ww3.T1(new hj8(0, 255, 1));
                int i2 = (int) jRandom;
                int i3 = (int) (jRandom >> 32);
                int i4 = ~i2;
                e1k e1kVar = new e1k();
                e1kVar.c = i2;
                e1kVar.d = i3;
                e1kVar.e = 0;
                e1kVar.f = 0;
                e1kVar.g = i4;
                e1kVar.h = (i2 << 10) ^ (i3 >>> 4);
                if ((i3 | i2 | i4) == 0) {
                    ore.p("Initial state must have at least one non-zero element.");
                    throw null;
                }
                for (int i5 = 0; i5 < 64; i5++) {
                    e1kVar.c();
                }
                List listV1 = ww3.V1(listT1);
                for (int iO0 = xw3.O0(listV1); iO0 > 0; iO0--) {
                    int iE = e1kVar.e(iO0 + 1);
                    ArrayList arrayList = (ArrayList) listV1;
                    arrayList.set(iE, arrayList.set(iO0, arrayList.get(iE)));
                }
                for (int i6 = 0; i6 < 256; i6++) {
                    ArrayList arrayList2 = (ArrayList) listV1;
                    ((int[]) this.b)[i6] = ((Number) arrayList2.get(i6)).intValue();
                    ((int[]) this.b)[i6 + np0.n] = ((Number) arrayList2.get(i6)).intValue();
                }
                return;
            case 24:
                this.b = new uvc(27);
                return;
        }
    }

    public static String h(String str, String str2) {
        return nbh.v(str, "|T|", str2, "|*");
    }

    public static zo7 i(Context context) {
        yab.s(context);
        synchronized (zo7.class) {
            if (c == null) {
                txk txkVar = pwl.a;
                synchronized (pwl.class) {
                    if (pwl.c == null) {
                        pwl.c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                c = new zo7(context, 0);
            }
        }
        return c;
    }

    public static float j(float f, float f2, int i) {
        int i2 = i & 3;
        if (i2 == 0) {
            return f + f2;
        }
        if (i2 == 1) {
            return (-f) + f2;
        }
        if (i2 == 2) {
            return f - f2;
        }
        if (i2 != 3) {
            return 0.0f;
        }
        return (-f) - f2;
    }

    public static zo7 l(nmc nmcVar) {
        String str;
        nmcVar.O(2);
        int iA = nmcVar.A();
        int i = iA >> 1;
        int iA2 = ((nmcVar.A() >> 3) & 31) | ((iA & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbC = nbh.C(str);
        sbC.append(i < 10 ? ".0" : ".");
        sbC.append(i);
        return new zo7(13, zo5.v(sbC, iA2 < 10 ? ".0" : ".", iA2));
    }

    public static hi0 p(rh0 rh0Var) throws ImageCaptureException {
        hi0 hi0Var = rh0Var.a;
        l78 l78Var = (l78) hi0Var.a;
        Rect rect = hi0Var.e;
        try {
            byte[] bArrE = f3m.e(l78Var, rect, rh0Var.b, hi0Var.f);
            try {
                ge6 ge6Var = new ge6(new se6(new ByteArrayInputStream(bArrE)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                int i = hi0Var.f;
                Matrix matrix = hi0Var.g;
                RectF rectF = y1i.a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                return new hi0(bArrE, ge6Var, np0.n, size, rect2, i, matrix2, hi0Var.h);
            } catch (IOException e) {
                throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (ImageUtil$CodecFailedException e2) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e2);
        }
    }

    public static final boolean w(PackageInfo packageInfo, boolean z) {
        gok gokVar;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                gok gokVar2 = z ? mul.c : mul.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        fnk fnkVar = snk.b;
                        Object[] objArr = {byteArray};
                        xsg.q(objArr, 1);
                        gokVar = new gok(objArr, 1);
                    } else {
                        fnk fnkVar2 = snk.b;
                        gokVar = gok.e;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        fnk fnkVar3 = snk.b;
                        gokVar = gok.e;
                    } else {
                        fnk fnkVar4 = snk.b;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i3].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i4] = byteArray2;
                            i3++;
                            i4 = i5;
                        }
                        gokVar = i4 == 0 ? gok.e : new gok(objArrCopyOf, i4);
                    }
                }
                if (gokVar.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                snk snkVarF = gokVar.f();
                int size = snkVarF.size();
                int i6 = 0;
                while (i6 < size) {
                    byte[] bArr = (byte[]) snkVarF.get(i6);
                    fnk fnkVarListIterator = gokVar2.listIterator(0);
                    do {
                        int i7 = i6 + 1;
                        if (!fnkVarListIterator.hasNext()) {
                            i6 = i7;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) fnkVarListIterator.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? y(packageInfo, mul.a) : y(packageInfo, mul.a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static pil y(PackageInfo packageInfo, pil... pilVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            wll wllVar = new wll(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < pilVarArr.length; i++) {
                if (pilVarArr[i].equals(wllVar)) {
                    return pilVarArr[i];
                }
            }
        }
        return null;
    }

    @Override // defpackage.kg7
    public void a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 14:
                f86 f86Var = (f86) obj;
                m86 m86Var = (m86) obj2;
                f86Var.b(m86Var.q.x());
                if (!f86Var.f.get()) {
                    f86Var.h = true;
                    f86Var.c();
                    o9b.a(o9b.g(f86Var.d), new vn7(15, this), m86Var.h);
                } else {
                    ore.k("The buffer is submitted or canceled.");
                }
                break;
            default:
                ((mof) obj2).m(((bxa) obj).b);
                break;
        }
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        ((CidLogger) ((ih) this.b).b).logException("BitrateDumpGatheringConfigCacherImpl", "Error getting remote bitrate dump config", (Throwable) obj);
    }

    @Override // defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        tm9 tm9Var = (tm9) this.b;
        tm9Var.getClass();
        entry.getClass();
        return new rm9(entry, tm9Var);
    }

    @Override // defpackage.fr0
    public void b(le4 le4Var) {
        boolean z = le4Var.b == 0;
        a aVar = (a) this.b;
        if (z) {
            aVar.e(null, aVar.w);
            return;
        }
        v56 v56Var = aVar.o;
        if (v56Var != null) {
            ((io7) v56Var.b).G(le4Var);
        }
    }

    @Override // defpackage.cj1
    public int c() {
        y8j y8jVar = ((fj1) this.b).u;
        int measuredHeight = y8jVar.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = y8jVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = measuredHeight - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = y8jVar.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
        return zo5.D(12.0f, yl5.d().getDisplayMetrics().density, i - (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0));
    }

    @Override // defpackage.cj1
    public int d() {
        y8j y8jVar = ((fj1) this.b).u;
        int measuredWidth = y8jVar.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = y8jVar.getLayoutParams();
        int marginEnd = measuredWidth - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0);
        ViewGroup.LayoutParams layoutParams2 = y8jVar.getLayoutParams();
        return marginEnd - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(nq4 nq4Var) {
        knf knfVar;
        if (nq4Var instanceof knf) {
            knfVar = (knf) nq4Var;
            int i = knfVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                knfVar.f = i - Integer.MIN_VALUE;
            } else {
                knfVar = new knf(this, nq4Var);
            }
        } else {
            knfVar = new knf(this, nq4Var);
        }
        Object obj = knfVar.d;
        int i2 = knfVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            throw null;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        if (((i40) this.b).a(jnf.a, jnf.b)) {
            return sbi.a;
        }
        throw null;
    }

    @Override // defpackage.oca
    public void f(yba ybaVar, boolean z) {
        ur urVar;
        vr vrVar = (vr) this.b;
        yba ybaVarL = ybaVar.l();
        int i = 0;
        boolean z2 = ybaVarL != ybaVar;
        if (z2) {
            ybaVar = ybaVarL;
        }
        ur[] urVarArr = vrVar.X;
        int length = urVarArr != null ? urVarArr.length : 0;
        while (true) {
            if (i < length) {
                urVar = urVarArr[i];
                if (urVar != null && urVar.h == ybaVar) {
                    break;
                } else {
                    i++;
                }
            } else {
                urVar = null;
                break;
            }
        }
        if (urVar != null) {
            if (!z2) {
                vrVar.t(urVar, z);
            } else {
                vrVar.r(urVar.a, urVar, ybaVarL);
                vrVar.t(urVar, true);
            }
        }
    }

    public void g(String str) {
        l1c l1cVar = (l1c) this.b;
        l1c.j(l1cVar, v78.b(str), null, 6);
        l1cVar.setVisibility(0);
    }

    @Override // defpackage.q5j
    public boolean isDebugEnabled() {
        GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
        return ((xb9) ((et3) gifViewerWidget.e.getValue())).g0() && ((Boolean) ((e5d) gifViewerWidget.d.getValue()).x().i()).booleanValue();
    }

    @Override // defpackage.q5j
    public int k() {
        rui ruiVar = ((GifViewerWidget) this.b).k;
        if (ruiVar != null) {
            return ruiVar.getHeight();
        }
        return 0;
    }

    @Override // defpackage.oca
    public boolean m(yba ybaVar) {
        Window.Callback callback;
        vr vrVar = (vr) this.b;
        if (ybaVar != ybaVar.l() || !vrVar.F || (callback = vrVar.l.getCallback()) == null || vrVar.p1) {
            return true;
        }
        callback.onMenuOpened(108, ybaVar);
        return true;
    }

    @Override // defpackage.q5j
    public int n() {
        rui ruiVar = ((GifViewerWidget) this.b).k;
        if (ruiVar != null) {
            return ruiVar.getWidth();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r1 != (-1)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.hi0 o(defpackage.rh0 r11, int r12) {
        /*
            r10 = this;
            hi0 r11 = r11.a
            java.lang.Object r10 = r10.b
            zo7 r10 = (defpackage.zo7) r10
            java.lang.Object r0 = r11.a
            l78 r0 = (defpackage.l78) r0
            java.lang.Object r10 = r10.b
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r10 = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) r10
            r1 = 0
            if (r10 != 0) goto L29
            k78[] r10 = r0.e0()
            r10 = r10[r1]
            java.nio.ByteBuffer r10 = r10.getBuffer()
            int r0 = r10.capacity()
            byte[] r0 = new byte[r0]
            r10.rewind()
            r10.get(r0)
        L27:
            r2 = r0
            goto L84
        L29:
            k78[] r10 = r0.e0()
            r10 = r10[r1]
            java.nio.ByteBuffer r10 = r10.getBuffer()
            int r0 = r10.capacity()
            byte[] r2 = new byte[r0]
            r10.rewind()
            r10.get(r2)
            r3 = 2
            r4 = r3
        L41:
            int r5 = r4 + 4
            r6 = -1
            if (r5 > r0) goto L68
            r5 = r2[r4]
            if (r5 == r6) goto L4b
            goto L68
        L4b:
            if (r5 != r6) goto L56
            int r5 = r4 + 1
            r5 = r2[r5]
            r6 = -38
            if (r5 != r6) goto L56
            goto L7b
        L56:
            int r5 = r4 + 2
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            int r6 = r4 + 3
            r6 = r2[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            int r5 = r5 + r3
            int r4 = r4 + r5
            goto L41
        L68:
            int r1 = r3 + 1
            if (r1 <= r0) goto L6e
            r1 = r6
            goto L79
        L6e:
            r4 = r2[r3]
            if (r4 != r6) goto L9a
            r4 = r2[r1]
            r5 = -40
            if (r4 != r5) goto L9a
            r1 = r3
        L79:
            if (r1 == r6) goto L84
        L7b:
            int r10 = r10.limit()
            byte[] r0 = java.util.Arrays.copyOfRange(r2, r1, r10)
            goto L27
        L84:
            ge6 r3 = r11.b
            java.util.Objects.requireNonNull(r3)
            android.util.Size r5 = r11.d
            android.graphics.Rect r6 = r11.e
            int r7 = r11.f
            android.graphics.Matrix r8 = r11.g
            gd2 r9 = r11.h
            hi0 r1 = new hi0
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L9a:
            r4 = r12
            r3 = r1
            r12 = r4
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo7.o(rh0, int):hi0");
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 14:
                ((m86) obj).b(0, "Unable to acquire InputBuffer.", th);
                break;
            default:
                ((mof) obj).n(th);
                break;
        }
    }

    @Override // defpackage.q5j
    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((GifViewerWidget) this.b).c;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "Media viewer. Video viewer, surface destroyed " + surfaceTexture, null);
        }
    }

    public void q() {
        i40 i40Var = (i40) this.b;
        i40Var.getClass();
        if (i40.b.getAndSet(i40Var, jnf.c) == jnf.b) {
            throw null;
        }
    }

    @Override // defpackage.btb
    public ixj s(View view, ixj ixjVar) {
        exj exjVar = ixjVar.a;
        et4 et4Var = (et4) this.b;
        if (!Objects.equals(et4Var.m, ixjVar)) {
            et4Var.m = ixjVar;
            boolean z = ixjVar.d() > 0;
            et4Var.n = z;
            et4Var.setWillNotDraw(!z && et4Var.getBackground() == null);
            if (!exjVar.m()) {
                int childCount = et4Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = et4Var.getChildAt(i);
                    WeakHashMap weakHashMap = i7j.a;
                    if (childAt.getFitsSystemWindows() && ((bt4) childAt.getLayoutParams()).a != null && exjVar.m()) {
                        break;
                    }
                }
            }
            et4Var.requestLayout();
        }
        return ixjVar;
    }

    @Override // defpackage.t65
    public Object t() {
        return new CallOpponentsListWidget((ha9) this.b);
    }

    @Override // defpackage.zs3
    public boolean u(ClickableSpan clickableSpan, int i, int i2, String str, t59 t59Var, MotionEvent motionEvent) {
        zs3 onLinkLongClickListener = ((zyf) this.b).getOnLinkLongClickListener();
        return onLinkLongClickListener != null && onLinkLongClickListener.u(clickableSpan, i, i2, str, t59Var, motionEvent);
    }

    @Override // defpackage.q5j
    public int v() {
        return 2;
    }

    @Override // defpackage.q5j
    public void x(Surface surface, uvi uviVar) {
        String str = ((GifViewerWidget) this.b).c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Media viewer. Video viewer, set surface " + surface, null);
            }
        }
        e3j e3jVarW1 = ((GifViewerWidget) this.b).w1();
        if (e3jVarW1 != null) {
            e3jVarW1.H(surface);
            e3jVarW1.C(uviVar);
        }
    }

    public zo7(Context context, int i) {
        boolean zIsEmpty;
        this.a = i;
        switch (i) {
            case 15:
                l1c l1cVar = new l1c(context);
                l1cVar.setId(R.id.oneme_stickers_sticker_first_frame);
                l1cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                wj6 wj6Var = ((wj7) l1cVar.getHierarchy()).e;
                wj6Var.l = 0;
                if (wj6Var.k == 1) {
                    wj6Var.k = 0;
                }
                wj7 wj7Var = (wj7) l1cVar.getHierarchy();
                i1f i1fVar = i1f.m;
                wj7Var.i(1, wj7Var.b.getDrawable(R.drawable.sticker_placeholder));
                wj7Var.f(1).q(i1fVar);
                this.b = l1cVar;
                return;
            case 28:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.b = sharedPreferences;
                File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
                if (file.exists()) {
                    return;
                }
                try {
                    if (file.createNewFile()) {
                        synchronized (this) {
                            zIsEmpty = sharedPreferences.getAll().isEmpty();
                        }
                        if (zIsEmpty) {
                            return;
                        }
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                        return;
                    }
                    return;
                } catch (IOException e) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                        return;
                    }
                    return;
                }
            default:
                this.b = context.getApplicationContext();
                return;
        }
    }

    public zo7(a aVar) {
        this.a = 3;
        Objects.requireNonNull(aVar);
        this.b = aVar;
    }

    public /* synthetic */ zo7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public zo7(s2e s2eVar, int i) {
        this.a = i;
        switch (i) {
            case 18:
                this.b = (IncorrectJpegMetadataQuirk) s2eVar.b(IncorrectJpegMetadataQuirk.class);
                break;
            default:
                this.b = new zo7(s2eVar, 18);
                break;
        }
    }

    public zo7(fol folVar) {
        this.a = 25;
        this.b = gvk.c(jnf.a);
    }
}
