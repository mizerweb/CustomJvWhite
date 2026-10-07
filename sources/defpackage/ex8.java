package defpackage;

import android.app.Notification;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.LinearInterpolator;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.chatmedia.viewer.photo.BasePhotoViewerWidget;

/* JADX INFO: loaded from: classes2.dex */
public class ex8 implements ct, zvc, zy0, t65, ij1, wxe, f96, m64, l8e, opb, ip5, ine, cub, kg7, tm9, jg7 {
    public final /* synthetic */ int a;
    public Object b;

    public ex8(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new y4(this);
                break;
            case 10:
                this.b = new LinkedHashMap();
                break;
            case 12:
                this.b = new AtomicReference(null);
                break;
            case 27:
                this.b = new ArrayList(9);
                break;
            case 28:
                m0g m0gVar = new m0g();
                this.b = m0gVar;
                m0gVar.k = PorterDuff.Mode.SRC_IN;
                break;
            case 29:
                this.b = c76.a;
                break;
        }
    }

    @Override // defpackage.f96
    public boolean A() {
        return ((m43) ((x43) this.b).o1.getValue()).c;
    }

    @Override // defpackage.l8e
    public void B(Object obj, zv8 zv8Var, Object obj2) {
        tt4 tt4Var = (xf5) ((AtomicReference) this.b).accumulateAndGet((xf5) obj2, new bu4());
        if (tt4Var != null) {
            ((up8) tt4Var).start();
        }
    }

    public int[] C() {
        return super/*android.widget.TextView*/.getAutoSizeTextAvailableSizes();
    }

    public int D() {
        return super/*android.widget.TextView*/.getAutoSizeTextType();
    }

    public Object E() {
        return (AccessibilityNodeProvider) this.b;
    }

    public TextClassifier F() {
        return super/*android.widget.TextView*/.getTextClassifier();
    }

    public boolean G(int i, int i2, Bundle bundle) {
        return false;
    }

    public void H(int i, int i2, int i3, int i4) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public void I(int[] iArr, int i) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public void J(int i) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeWithDefaults(i);
    }

    public void K() {
        ((m0g) this.b).j = false;
    }

    public void L(float f) {
        int iMin = (int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f);
        m0g m0gVar = (m0g) this.b;
        m0gVar.e = (iMin << 24) | (m0gVar.e & 16777215);
    }

    public void M(int i) {
        m0g m0gVar = (m0g) this.b;
        m0gVar.e = (i & 16777215) | (m0gVar.e & (-16777216));
    }

    public void N(long j) {
        if (j >= 0) {
            ((m0g) this.b).n = j;
        } else {
            c.o(zo5.j(j, "Given a negative duration: "));
        }
    }

    public void O(int i) {
        if (i >= 0) {
            ((m0g) this.b).f = i;
        } else {
            c.o(zo5.h(i, "Given invalid width: "));
        }
    }

    public void P(int i) {
        ((m0g) this.b).d = i;
    }

    public void Q(LinearInterpolator linearInterpolator) {
        ((m0g) this.b).p = linearInterpolator;
    }

    public void R(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }

    public void S() {
        ((m0g) this.b).getClass();
    }

    public boolean T(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((fgg) it.next()).c));
        }
        Set setX1 = ww3.X1(arrayList);
        boolean z = !setX1.equals((Set) this.b);
        this.b = setX1;
        return z;
    }

    @Override // defpackage.cub
    public void a(Object obj) {
        switch (this.a) {
            case 17:
                ((iu) this.b).invoke(obj);
                break;
            case 18:
                break;
            default:
                ush ushVar = (ush) obj;
                boolean zP = ushVar.p();
                mof mofVar = (mof) this.b;
                if (!zP) {
                    mofVar.m(Long.valueOf(ushVar.m(0, new tsh(), 0L).l));
                } else {
                    mofVar.m(-9223372036854775807L);
                }
                break;
        }
    }

    @Override // defpackage.m64
    public void b() {
        ((s8g) this.b).a(sbi.a);
    }

    @Override // defpackage.m64
    public void c(ko5 ko5Var) {
        ((s8g) this.b).c(ko5Var);
    }

    @Override // defpackage.ine
    public void d(Object obj) {
        ((mx6) this.b).b.d((byte[]) obj);
    }

    @Override // defpackage.zvc
    public void e() {
        ((BasePhotoViewerWidget) this.b).s1();
    }

    @Override // defpackage.f96
    public boolean f() {
        return false;
    }

    @Override // defpackage.ct
    public void g(int i) {
    }

    @Override // defpackage.tm9
    public Object h(Object obj, Object obj2) {
        return ((mf7) this.b).mo41apply(obj2);
    }

    @Override // defpackage.zvc
    public void i(Throwable th) {
        ((BasePhotoViewerWidget) this.b).r1();
    }

    @Override // defpackage.ct
    public void j(int i, float f) {
    }

    @Override // defpackage.ip5
    public void k() {
        ((op5) ((pp5) this.b).d).q();
    }

    @Override // defpackage.ct
    public void l(int i) {
    }

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        return (xf5) ((AtomicReference) this.b).get();
    }

    @Override // defpackage.zvc
    public boolean n() {
        Object targetController = ((BasePhotoViewerWidget) this.b).getTargetController();
        as0 as0Var = targetController instanceof as0 ? (as0) targetController : null;
        if (as0Var == null) {
            return true;
        }
        as0Var.k();
        return true;
    }

    @Override // defpackage.f96
    public void o() {
        x43 x43Var = (x43) this.b;
        if (((m43) x43Var.o1.getValue()).a.isEmpty()) {
            return;
        }
        p20 p20Var = x43Var.X;
        if (p20Var == null) {
            gm0.Y(x43.class.getName(), "Early return in loadPrev cuz of loader is null");
            return;
        }
        rt2 rt2VarG = x43Var.G();
        fda fdaVar = rt2VarG != null ? rt2VarG.c : null;
        if ((fdaVar != null ? Long.valueOf(fdaVar.getC()) : null) != null) {
            p20Var.y();
        }
    }

    @Override // defpackage.m64
    public void onError(Throwable th) {
        ((s8g) this.b).onError(th);
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) throws Exception {
        switch (this.a) {
            case 18:
                ((l78) this.b).close();
                break;
            default:
                ((mof) this.b).n(th);
                break;
        }
    }

    @Override // defpackage.ip5
    public void p(int i) {
        pp5.c((pp5) this.b, false, i * 10);
    }

    public void q(vq3 vq3Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = vq3Var.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(vq3Var.e[0]), vq3Var);
    }

    public void r(Object obj) {
        ArrayList arrayList = (ArrayList) this.b;
        if (obj != null) {
            arrayList.add(obj);
        } else {
            ore.n("Set contributions cannot be null");
        }
    }

    public m0g s() {
        m0g m0gVar = (m0g) this.b;
        int[] iArr = m0gVar.b;
        int i = m0gVar.e;
        iArr[0] = i;
        iArr[1] = i;
        iArr[2] = m0gVar.d;
        iArr[3] = i;
        iArr[4] = i;
        float[] fArr = m0gVar.a;
        fArr[0] = 0.0f;
        fArr[1] = 0.25f;
        fArr[2] = 0.5f;
        fArr[3] = 0.75f;
        fArr[4] = 1.0f;
        return m0gVar;
    }

    @Override // defpackage.t65
    public Object t() {
        return new CallAdminSettingsScreen((ha9) this.b);
    }

    public x4 u(int i) {
        return null;
    }

    @Override // defpackage.f96
    public void v() {
    }

    public x4 w(int i) {
        return null;
    }

    public int x() {
        return super/*android.widget.TextView*/.getAutoSizeMaxTextSize();
    }

    public int y() {
        return super/*android.widget.TextView*/.getAutoSizeMinTextSize();
    }

    public int z() {
        return super/*android.widget.TextView*/.getAutoSizeStepGranularity();
    }

    public /* synthetic */ ex8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public ex8(m38 m38Var) {
        this.a = 8;
        yab.s(m38Var);
        this.b = m38Var;
    }

    public ex8(p64 p64Var, s8g s8gVar) {
        this.a = 11;
        this.b = s8gVar;
    }

    public ex8(Notification notification) {
        this.a = 21;
        notification.getClass();
        this.b = notification;
    }
}
