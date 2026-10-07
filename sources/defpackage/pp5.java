package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Property;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class pp5 implements lwh {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public pp5(final Context context, g0d g0dVar, af7 af7Var, op5 op5Var) {
        this.b = g0dVar;
        this.c = af7Var;
        this.d = op5Var;
        ed7 ed7Var = new ed7(context);
        this.e = ed7Var;
        ed7 ed7Var2 = new ed7(context);
        this.f = ed7Var2;
        this.g = new GestureDetector(context, new pi9(10, this));
        final int i = 0;
        this.h = new mp5(i, this);
        this.i = new Rect();
        this.a = gm0.K(92.0f * yl5.d().getDisplayMetrics().density);
        this.j = rx8.P(3, new af7(this) { // from class: np5
            public final /* synthetic */ pp5 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                Context context2 = context;
                pp5 pp5Var = this.b;
                switch (i2) {
                    case 0:
                        return pp5Var.f(context2, true);
                    default:
                        return pp5Var.f(context2, false);
                }
            }
        });
        final int i2 = 1;
        this.k = rx8.P(3, new af7(this) { // from class: np5
            public final /* synthetic */ pp5 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                Context context2 = context;
                pp5 pp5Var = this.b;
                switch (i3) {
                    case 0:
                        return pp5Var.f(context2, true);
                    default:
                        return pp5Var.f(context2, false);
                }
            }
        });
        ed7Var2.c = new ex8(14, this);
        ed7Var.c = new ks9(13, this);
    }

    public static final void c(pp5 pp5Var, boolean z, int i) {
        TextView textView;
        g0d g0dVar = (g0d) pp5Var.b;
        mp5 mp5Var = (mp5) pp5Var.h;
        g0dVar.removeCallbacks(new eq0(3, mp5Var));
        String string = g0dVar.getContext().getString(R.string.oneme_chatmedia_viewer_seek_seconds, Integer.valueOf(i));
        if (z) {
            pp5Var.l = e(pp5Var.k(), (Animator) pp5Var.l);
            n7j.a(g0dVar, pp5Var.k(), -1);
            View childAt = pp5Var.k().getChildAt(0);
            textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                textView.setText(string);
            }
            pp5Var.l = d(pp5Var.k(), (Animator) pp5Var.l);
        } else {
            pp5Var.m = e(pp5Var.m(), (Animator) pp5Var.m);
            n7j.a(g0dVar, pp5Var.m(), -1);
            View childAt2 = pp5Var.m().getChildAt(0);
            textView = childAt2 instanceof TextView ? (TextView) childAt2 : null;
            if (textView != null) {
                textView.setText(string);
            }
            pp5Var.m = d(pp5Var.m(), (Animator) pp5Var.m);
        }
        e3j e3jVar = (e3j) ((af7) pp5Var.c).invoke();
        if (e3jVar == null) {
            gm0.n(pp5.class.getName(), "Media viewer. Can't seek by double tap because player is null");
            return;
        }
        long jE = e3jVar.e();
        long j = z ? jE + 10000 : jE - 10000;
        long duration = e3jVar.getDuration();
        if (j > duration) {
            pp5Var.clear();
            j = duration;
        }
        if (j < 0) {
            pp5Var.clear();
            j = 0;
        }
        if (e3jVar.P() || e3jVar.isIdle()) {
            ((op5) pp5Var.d).r(j);
        }
        e3jVar.seekTo(j);
        g0dVar.postDelayed(new eq0(4, mp5Var), 600L);
    }

    public static Animator d(ViewGroup viewGroup, Animator animator) {
        if (viewGroup.getVisibility() == 0 && animator != null && animator.isRunning()) {
            return animator;
        }
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, viewGroup.getAlpha(), 1.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new c7(viewGroup, 2));
        objectAnimatorOfFloat.start();
        return objectAnimatorOfFloat;
    }

    public static Animator e(ViewGroup viewGroup, Animator animator) {
        if (viewGroup.getVisibility() != 0) {
            return animator;
        }
        if (animator != null && animator.isRunning()) {
            return animator;
        }
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, viewGroup.getAlpha(), 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new c7(viewGroup, 3));
        objectAnimatorOfFloat.start();
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.lwh
    public boolean a(MotionEvent motionEvent) {
        g0d g0dVar = (g0d) this.b;
        Rect rect = (Rect) this.i;
        g0dVar.getHitRect(rect);
        int x = (int) motionEvent.getX();
        int i = rect.right;
        int i2 = rect.left;
        int i3 = (i - i2) / 6;
        if (x >= i2 && x <= rect.centerX() - i3) {
            ed7 ed7Var = (ed7) this.f;
            ((GestureDetector) ed7Var.d).onTouchEvent(motionEvent);
            return ed7Var.b > 0;
        }
        if (x < rect.centerX() + i3 || x > rect.right) {
            ((GestureDetector) this.g).onTouchEvent(motionEvent);
            return false;
        }
        ed7 ed7Var2 = (ed7) this.e;
        ((GestureDetector) ed7Var2.d).onTouchEvent(motionEvent);
        return ed7Var2.b > 0;
    }

    @Override // defpackage.lwh
    public boolean b(MotionEvent motionEvent) {
        return motionEvent.getPointerCount() <= 1;
    }

    @Override // defpackage.lwh
    public void clear() {
        if (k().getVisibility() == 0) {
            this.l = e(k(), (Animator) this.l);
        }
        if (m().getVisibility() == 0) {
            this.m = e(m(), (Animator) this.m);
        }
        ((ed7) this.e).b = 0;
        ((ed7) this.f).b = 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public FrameLayout f(Context context, boolean z) {
        FrameLayout frameLayout = new FrameLayout(context);
        int i = z ? 8388629 : 8388627;
        int i2 = this.a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2, i);
        if (z) {
            layoutParams.rightMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        } else {
            layoutParams.leftMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        }
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        q9i.a(q9i.s, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.l(textView).b.getText().b);
        int i3 = z ? R.drawable.icon_player_forward : R.drawable.icon_player_rewind;
        int i4 = a8gVar.l(textView).b.getIcon().b;
        Drawable drawableMutate = textView.getContext().getDrawable(i3).mutate();
        sb8.m0(i4, drawableMutate);
        ArrayList arrayList = soh.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawableMutate, (Drawable) null, (Drawable) null);
        frameLayout.addView(textView);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        a8gVar.l(frameLayout);
        shapeDrawable.setTint(-1728053248);
        frameLayout.setBackground(shapeDrawable);
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    public void g(fx5 fx5Var, w80 w80Var) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.e = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            ore.k("Unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.e, iArr, 0, iArr, 1)) {
            this.e = EGL14.EGL_NO_DISPLAY;
            ore.k("Unable to initialize EGL14");
            return;
        }
        if (w80Var != null) {
            w80Var.b = iArr[0] + "." + iArr[1];
        }
        int i = fx5Var.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.e, new int[]{12324, i, 12323, i, 12322, i, 12321, fx5Var.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, fx5Var.a() ? 64 : 4, EglBase.EGL_RECORDABLE_ANDROID, fx5Var.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            ore.k("Unable to find a suitable EGLConfig");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.e, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, fx5Var.a() ? 3 : 2, 12344}, 0);
        xg7.a("eglCreateContext");
        this.h = eGLConfig;
        this.f = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext((EGLDisplay) this.e, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public gi0 h(Surface surface) {
        try {
            try {
                EGLDisplay eGLDisplay = (EGLDisplay) this.e;
                EGLConfig eGLConfig = (EGLConfig) this.h;
                Objects.requireNonNull(eGLConfig);
                EGLSurface eGLSurfaceI = xg7.i(eGLDisplay, eGLConfig, surface, (int[]) this.g);
                EGLDisplay eGLDisplay2 = (EGLDisplay) this.e;
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12375, iArr, 0);
                int i = iArr[0];
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12374, iArr2, 0);
                Size size = new Size(i, iArr2[0]);
                return new gi0(eGLSurfaceI, size.getWidth(), size.getHeight());
            } catch (IllegalArgumentException | IllegalStateException e) {
                e = e;
                tvj.i("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
                return null;
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            tvj.i("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    public void i() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.e;
        EGLConfig eGLConfig = (EGLConfig) this.h;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = xg7.a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        xg7.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            this.i = eGLSurfaceEglCreatePbufferSurface;
        } else {
            ore.k("surface was null");
        }
    }

    public amc j(fx5 fx5Var) {
        xg7.d((AtomicBoolean) this.b, false);
        try {
            g(fx5Var, null);
            i();
            o((EGLSurface) this.i);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.e, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new amc(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            tvj.i("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new amc("", "");
        } finally {
            r();
        }
    }

    public ViewGroup k() {
        return (ViewGroup) ((ny8) this.j).getValue();
    }

    public gi0 l(Surface surface) {
        HashMap map = (HashMap) this.c;
        qyj.l("The surface is not registered.", map.containsKey(surface));
        gi0 gi0Var = (gi0) map.get(surface);
        Objects.requireNonNull(gi0Var);
        return gi0Var;
    }

    public ViewGroup m() {
        return (ViewGroup) ((ny8) this.k).getValue();
    }

    public oh0 n(fx5 fx5Var) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        xg7.d(atomicBoolean, false);
        w80 w80Var = new w80();
        w80Var.a = "0.0";
        w80Var.b = "0.0";
        w80Var.c = "";
        w80Var.d = "";
        try {
            if (fx5Var.a()) {
                amc amcVarJ = j(fx5Var);
                String str = (String) amcVarJ.a;
                str.getClass();
                String str2 = (String) amcVarJ.b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    tvj.g("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    fx5Var = fx5.d;
                }
                this.g = xg7.f(str2, fx5Var);
                w80Var.c = str;
                w80Var.d = str2;
            }
            g(fx5Var, w80Var);
            i();
            o((EGLSurface) this.i);
            w80Var.a = xg7.j();
            this.k = xg7.g(fx5Var);
            int iH = xg7.h();
            this.a = iH;
            u(iH);
            this.d = Thread.currentThread();
            atomicBoolean.set(true);
            String strConcat = w80Var.c == null ? "".concat(" glExtensions") : "";
            if (w80Var.d == null) {
                strConcat = strConcat.concat(" eglExtensions");
            }
            if (strConcat.isEmpty()) {
                return new oh0(w80Var.a, w80Var.b, w80Var.c, w80Var.d);
            }
            ore.k("Missing required properties:".concat(strConcat));
            return null;
        } catch (IllegalArgumentException e) {
            e = e;
            r();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            r();
            throw e;
        }
    }

    public void o(EGLSurface eGLSurface) {
        ((EGLDisplay) this.e).getClass();
        ((EGLContext) this.f).getClass();
        if (EGL14.eglMakeCurrent((EGLDisplay) this.e, eGLSurface, eGLSurface, (EGLContext) this.f)) {
            return;
        }
        ore.k("eglMakeCurrent failed");
    }

    public void p(Surface surface) {
        xg7.d((AtomicBoolean) this.b, true);
        xg7.c((Thread) this.d);
        HashMap map = (HashMap) this.c;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, xg7.j);
    }

    public void q() {
        if (((AtomicBoolean) this.b).getAndSet(false)) {
            xg7.c((Thread) this.d);
            r();
        }
    }

    public void r() {
        HashMap map = (HashMap) this.c;
        Iterator it = ((Map) this.k).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((vg7) it.next()).a);
        }
        this.k = Collections.EMPTY_MAP;
        this.l = null;
        if (!Objects.equals((EGLDisplay) this.e, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.e;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (gi0 gi0Var : map.values()) {
                if (!Objects.equals(gi0Var.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.e, gi0Var.a)) {
                    try {
                        xg7.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        tvj.d("GLUtils", e.toString(), e);
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.i, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.e, (EGLSurface) this.i);
                this.i = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.f, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.e, (EGLContext) this.f);
                this.f = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.e);
            this.e = EGL14.EGL_NO_DISPLAY;
        }
        this.h = null;
        this.a = -1;
        this.m = ug7.a;
        this.j = null;
        this.d = null;
    }

    public void s(Surface surface, boolean z) {
        if (((Surface) this.j) == surface) {
            this.j = null;
            o((EGLSurface) this.i);
        }
        HashMap map = (HashMap) this.c;
        gi0 gi0Var = z ? (gi0) map.remove(surface) : (gi0) map.put(surface, xg7.j);
        if (gi0Var == null || gi0Var == xg7.j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.e, gi0Var.a);
        } catch (RuntimeException e) {
            tvj.i("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    public void t(long j, float[] fArr, Surface surface) {
        xg7.d((AtomicBoolean) this.b, true);
        xg7.c((Thread) this.d);
        gi0 gi0VarL = l(surface);
        if (gi0VarL == xg7.j) {
            gi0VarL = h(surface);
            if (gi0VarL == null) {
                return;
            } else {
                ((HashMap) this.c).put(surface, gi0VarL);
            }
        }
        int i = gi0VarL.c;
        int i2 = gi0VarL.b;
        EGLSurface eGLSurface = gi0VarL.a;
        if (surface != ((Surface) this.j)) {
            o(eGLSurface);
            this.j = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        vg7 vg7Var = (vg7) this.l;
        vg7Var.getClass();
        if (vg7Var instanceof wg7) {
            GLES20.glUniformMatrix4fv(((wg7) vg7Var).f, 1, false, fArr, 0);
            xg7.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        xg7.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.e, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.e, eGLSurface)) {
            return;
        }
        tvj.g("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        s(surface, false);
    }

    public void u(int i) {
        vg7 vg7Var = (vg7) ((Map) this.k).get((ug7) this.m);
        if (vg7Var == null) {
            qr7.x((ug7) this.m, "Unable to configure program for input format: ");
            return;
        }
        if (((vg7) this.l) != vg7Var) {
            this.l = vg7Var;
            vg7Var.b();
            Log.d("OpenGlRenderer", "Using program for input format " + ((ug7) this.m) + ": " + ((vg7) this.l));
        }
        GLES20.glActiveTexture(33984);
        xg7.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        xg7.b("glBindTexture");
    }

    public pp5() {
        this.b = new AtomicBoolean(false);
        this.c = new HashMap();
        this.e = EGL14.EGL_NO_DISPLAY;
        this.f = EGL14.EGL_NO_CONTEXT;
        this.g = xg7.a;
        this.i = EGL14.EGL_NO_SURFACE;
        this.k = Collections.EMPTY_MAP;
        this.l = null;
        this.m = ug7.a;
        this.a = -1;
    }
}
