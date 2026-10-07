package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.os.Build;
import android.util.SparseArray;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class nf5 implements twi {
    public static final /* synthetic */ int x = 0;
    public final Context b;
    public final wm7 c;
    public final boolean d;
    public final EGLDisplay e;
    public final x70 f;
    public final o02 g;
    public final swi h;
    public final Executor i;
    public final boolean j;
    public final uu6 k;
    public final r94 m;
    public mf5 n;
    public mf5 o;
    public boolean p;
    public final ex3 s;
    public final p51 t;
    public volatile oc7 u;
    public volatile boolean v;
    public volatile boolean w;
    public final ArrayList q = new ArrayList();
    public final Object r = new Object();
    public final ArrayList l = new ArrayList();

    static {
        sz9.a("media3.effect");
    }

    public nf5(Context context, wm7 wm7Var, boolean z, EGLDisplay eGLDisplay, x70 x70Var, o02 o02Var, swi swiVar, Executor executor, uu6 uu6Var, boolean z2, ex3 ex3Var, p51 p51Var, gke gkeVar) {
        this.b = context;
        this.c = wm7Var;
        this.d = z;
        this.e = eGLDisplay;
        this.f = x70Var;
        this.g = o02Var;
        this.h = swiVar;
        this.i = executor;
        this.j = z2;
        this.s = ex3Var;
        this.t = p51Var;
        this.k = uu6Var;
        r94 r94Var = new r94();
        this.m = r94Var;
        r94Var.f();
        ljf ljfVar = new ljf(this, executor, swiVar, o02Var, gkeVar);
        uu6Var.h.s();
        uu6Var.w = ljfVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0289  */
    /* JADX WARN: Code duplicated, block: B:109:0x028c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x028e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0291  */
    /* JADX WARN: Code duplicated, block: B:114:0x0299  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:131:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x02da  */
    /* JADX WARN: Code duplicated, block: B:139:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:146:0x030b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0322  */
    /* JADX WARN: Code duplicated, block: B:153:0x0325  */
    /* JADX WARN: Code duplicated, block: B:156:0x0332  */
    /* JADX WARN: Code duplicated, block: B:157:0x0334  */
    /* JADX WARN: Code duplicated, block: B:194:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
    public final void a(mf5 mf5Var, boolean z) throws VideoFrameProcessingException {
        ArrayList arrayList;
        boolean zH;
        String str;
        v30 v30VarL;
        String strGlGetString;
        float[] fArr;
        int i;
        md5 md5VarM;
        boolean z2;
        boolean z3;
        boolean z4;
        String str2;
        v30 v30VarL2;
        ghe gheVarR;
        int i2;
        boolean z5;
        ex3 ex3Var = ((b87) mf5Var.c).D;
        ex3Var.getClass();
        ex3 ex3Var2 = this.s;
        if (ex3.h(ex3Var)) {
            lvb.R(ex3Var.a == 6);
        }
        if (ex3.h(ex3Var) || ex3.h(ex3Var2)) {
            try {
                int[] iArr = new int[1];
                EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
                tab.e();
                if (iArr[0] != 3) {
                    throw new VideoFrameProcessingException("OpenGL ES 3.0 context support is required for HDR input or output.");
                }
            } catch (GlUtil$GlException e) {
                throw VideoFrameProcessingException.a(-9223372036854775807L, e);
            }
        }
        lvb.R(ex3Var.f());
        lvb.R(ex3Var.c != 1);
        boolean zF = ex3Var2.f();
        int i3 = ex3Var2.a;
        int i4 = ex3Var2.c;
        lvb.R(zF);
        lvb.R(i4 != 1);
        if (ex3.h(ex3Var) != ex3.h(ex3Var2)) {
            lvb.R((ex3Var.a == 6 && i3 != 6 && ex3.h(ex3Var) && (i4 == 10 || i4 == 3)) || (ex3Var.equals(ex3.i) && i3 == 6 && ex3.h(ex3Var2)));
        }
        if (z || !this.q.equals((List) mf5Var.d)) {
            int i5 = 0;
            while (true) {
                int size = this.l.size();
                arrayList = this.l;
                if (i5 >= size) {
                    break;
                }
                ((cn7) arrayList.get(i5)).release();
                i5++;
            }
            arrayList.clear();
            z88 z88Var = new z88(4);
            z88Var.f((List) mf5Var.d);
            p51 p51Var = this.t;
            if (p51Var != p51.c) {
                z88Var.c(new h55(p51Var, this.s));
            }
            ArrayList arrayList2 = this.l;
            Context context = this.b;
            ghe gheVarH = z88Var.h();
            ex3 ex3Var3 = this.s;
            uu6 uu6Var = this.k;
            z88 z88Var2 = new z88(4);
            z88 z88Var3 = new z88(4);
            z88 z88Var4 = new z88(4);
            for (int i6 = 0; i6 < gheVarH.d; i6++) {
                i36 i36Var = (i36) gheVarH.get(i6);
                lvb.O("DefaultVideoFrameProcessor only supports GlEffects", i36Var instanceof vm7);
                vm7 vm7Var = (vm7) i36Var;
                if (vm7Var instanceof po9) {
                    z88Var3.c((po9) vm7Var);
                } else {
                    boolean zH2 = ex3.h(ex3Var3);
                    ghe gheVarH2 = z88Var3.h();
                    ghe gheVarH3 = z88Var4.h();
                    if (!gheVarH2.isEmpty() || !gheVarH3.isEmpty()) {
                        z88Var2.c(md5.j(context, gheVarH2, gheVarH3, zH2));
                        z88Var3 = new z88(4);
                        z88Var4 = new z88(4);
                    }
                    z88Var2.c(vm7Var.a(context, zH2));
                }
            }
            ghe gheVarH4 = z88Var3.h();
            ghe gheVarH5 = z88Var4.h();
            uu6Var.h.s();
            ArrayList arrayList3 = uu6Var.b;
            arrayList3.clear();
            arrayList3.addAll(gheVarH4);
            ArrayList arrayList4 = uu6Var.c;
            arrayList4.clear();
            arrayList4.addAll(gheVarH5);
            uu6Var.x = true;
            arrayList2.addAll(z88Var2.h());
            z88 z88Var5 = new z88(4);
            this.f.i = (cn7) q4m.c(this.l.iterator(), this.k);
            z88Var5.f(this.l);
            wm7 wm7Var = this.c;
            ghe gheVarH6 = z88Var5.h();
            uu6 uu6Var2 = this.k;
            o02 o02Var = this.g;
            swi swiVar = this.h;
            Executor executor = this.i;
            ArrayList arrayList5 = new ArrayList(gheVarH6);
            arrayList5.add(uu6Var2);
            int i7 = 0;
            while (i7 < arrayList5.size() - 1) {
                cn7 cn7Var = (cn7) arrayList5.get(i7);
                i7++;
                cn7 cn7Var2 = (cn7) arrayList5.get(i7);
                euc eucVar = new euc(wm7Var, cn7Var, cn7Var2, o02Var);
                cn7Var.e(eucVar);
                cn7Var.d(executor, new ef5(swiVar, 0));
                cn7Var2.g(eucVar);
            }
            this.q.clear();
            this.q.addAll((List) mf5Var.d);
        }
        x70 x70Var = this.f;
        int i8 = mf5Var.b;
        oc7 oc7Var = new oc7((b87) mf5Var.c, mf5Var.a);
        ((cn7) x70Var.i).getClass();
        SparseArray sparseArray = (SparseArray) x70Var.h;
        lvb.a0("Input type not registered: %s", i8, vqi.l(sparseArray, i8));
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            n11 n11Var = ((gi8) sparseArray.get(sparseArray.keyAt(i9))).c;
            if (n11Var != null) {
                n11Var.b = false;
            }
        }
        gi8 gi8Var = (gi8) sparseArray.get(i8);
        ex3 ex3Var4 = oc7Var.a.D;
        ex3Var4.getClass();
        int i10 = ex3Var4.c;
        String str3 = "shaders/vertex_shader_transformation_es3.glsl";
        ex3 ex3Var5 = (ex3) x70Var.c;
        Context context2 = (Context) x70Var.b;
        if (i8 == 1) {
            boolean z6 = x70Var.a;
            ghe gheVar = md5.w;
            zH = ex3.h(ex3Var4);
            str3 = zH ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl";
            if (zH) {
                str = "shaders/fragment_shader_transformation_external_yuv_es3.glsl";
            } else {
                str = "shaders/fragment_shader_transformation_sdr_external_es2.glsl";
            }
            v30VarL = md5.l(context2, str3, str);
            if (zH) {
                if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
                    try {
                        EGLDisplay eGLDisplayT = tab.t();
                        EGLContext eGLContextK = tab.k(EGL14.EGL_NO_CONTEXT, eGLDisplayT, 2, tab.b);
                        tab.l(eGLContextK, eGLDisplayT);
                        strGlGetString = GLES20.glGetString(7939);
                        tab.o(eGLContextK, eGLDisplayT);
                    } catch (GlUtil$GlException unused) {
                    }
                } else {
                    strGlGetString = GLES20.glGetString(7939);
                }
                if (strGlGetString != null && strGlGetString.contains("GL_EXT_YUV_target")) {
                    if (ex3Var4.b == 1) {
                        fArr = md5.x;
                    } else {
                        fArr = md5.y;
                    }
                    v30VarL.A("uYuvToRgbColorTransform", fArr);
                    v30VarL.B(i10, "uInputColorTransfer");
                    if (ex3Var5.a != 6) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    v30VarL.B(i, "uApplyHdrToSdrToneMapping");
                }
                throw new VideoFrameProcessingException("The EXT_YUV_target extension is required for HDR editing input.");
            }
            v30VarL.c = z6;
            md5VarM = md5.m(v30VarL, ex3Var4, ex3Var5, ghe.e);
        } else if (i8 == 2 || i8 == 3) {
            ghe gheVar2 = md5.w;
            lvb.b0(i10 != 2 || i8 == 2);
            boolean zH3 = ex3.h(ex3Var4);
            if (i8 == 2) {
                z3 = zH3;
                z4 = ex3Var5.a == 6;
                if (!z3 && !z4) {
                    str3 = "shaders/vertex_shader_transformation_es2.glsl";
                }
                if (z4) {
                    str2 = "shaders/fragment_shader_transformation_ultra_hdr_es3.glsl";
                } else if (z3) {
                    str2 = "shaders/fragment_shader_transformation_hdr_internal_es3.glsl";
                } else {
                    str2 = "shaders/fragment_shader_transformation_sdr_internal_es2.glsl";
                }
                v30VarL2 = md5.l(context2, str3, str2);
                if (!z4) {
                    if (!z3 || i10 == 2 || i10 == 3) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    lvb.R(z5);
                    v30VarL2.B(i10, "uInputColorTransfer");
                }
                if (z3) {
                    if (ex3Var5.a != 6) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    v30VarL2.B(i2, "uApplyHdrToSdrToneMapping");
                }
                gheVarR = ghe.e;
                if (i8 == 2) {
                    gheVarR = c98.r(new ld5());
                }
                md5VarM = md5.m(v30VarL2, ex3Var4, ex3Var5, gheVarR);
            } else {
                z3 = zH3;
            }
            if (!z3) {
                str3 = "shaders/vertex_shader_transformation_es2.glsl";
            }
            if (z4) {
                str2 = "shaders/fragment_shader_transformation_ultra_hdr_es3.glsl";
            } else if (z3) {
                str2 = "shaders/fragment_shader_transformation_hdr_internal_es3.glsl";
            } else {
                str2 = "shaders/fragment_shader_transformation_sdr_internal_es2.glsl";
            }
            v30VarL2 = md5.l(context2, str3, str2);
            if (!z4) {
                if (z3) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                lvb.R(z5);
                v30VarL2.B(i10, "uInputColorTransfer");
            }
            if (z3) {
                if (ex3Var5.a != 6) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                v30VarL2.B(i2, "uApplyHdrToSdrToneMapping");
            }
            gheVarR = ghe.e;
            if (i8 == 2) {
                gheVarR = c98.r(new ld5());
            }
            md5VarM = md5.m(v30VarL2, ex3Var4, ex3Var5, gheVarR);
        } else {
            if (i8 != 4) {
                throw new VideoFrameProcessingException(zo5.h(i8, "Unsupported input type "));
            }
            boolean z7 = x70Var.a;
            ghe gheVar3 = md5.w;
            zH = ex3.h(ex3Var4);
            if (zH) {
            }
            if (zH) {
                str = "shaders/fragment_shader_transformation_external_yuv_es3.glsl";
            } else {
                str = "shaders/fragment_shader_transformation_sdr_external_es2.glsl";
            }
            v30VarL = md5.l(context2, str3, str);
            if (zH) {
                if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
                    EGLDisplay eGLDisplayT2 = tab.t();
                    EGLContext eGLContextK2 = tab.k(EGL14.EGL_NO_CONTEXT, eGLDisplayT2, 2, tab.b);
                    tab.l(eGLContextK2, eGLDisplayT2);
                    strGlGetString = GLES20.glGetString(7939);
                    tab.o(eGLContextK2, eGLDisplayT2);
                } else {
                    strGlGetString = GLES20.glGetString(7939);
                }
                if (strGlGetString != null) {
                    if (ex3Var4.b == 1) {
                        fArr = md5.x;
                    } else {
                        fArr = md5.y;
                    }
                    v30VarL.A("uYuvToRgbColorTransform", fArr);
                    v30VarL.B(i10, "uInputColorTransfer");
                    if (ex3Var5.a != 6) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    v30VarL.B(i, "uApplyHdrToSdrToneMapping");
                }
                throw new VideoFrameProcessingException("The EXT_YUV_target extension is required for HDR editing input.");
            }
            v30VarL.c = z7;
            md5VarM = md5.m(v30VarL, ex3Var4, ex3Var5, ghe.e);
        }
        Executor executor2 = (Executor) x70Var.g;
        ef5 ef5Var = (ef5) x70Var.f;
        md5VarM.e = executor2;
        md5VarM.d = ef5Var;
        u7e u7eVar = gi8Var.a;
        md5 md5Var = gi8Var.b;
        if (md5Var != null) {
            md5Var.release();
        }
        gi8Var.b = md5VarM;
        u7eVar.s(md5VarM);
        md5VarM.g(u7eVar);
        wm7 wm7Var2 = (wm7) x70Var.d;
        md5 md5Var2 = gi8Var.b;
        md5Var2.getClass();
        n11 n11Var2 = new n11(wm7Var2, md5Var2, (cn7) x70Var.i, (o02) x70Var.e);
        gi8Var.c = n11Var2;
        md5 md5Var3 = gi8Var.b;
        md5Var3.getClass();
        md5Var3.c = n11Var2;
        n11 n11Var3 = gi8Var.c;
        if (n11Var3 == null) {
            z2 = true;
        } else {
            z2 = true;
            n11Var3.b = true;
        }
        cn7 cn7Var3 = (cn7) x70Var.i;
        n11Var3.getClass();
        cn7Var3.g(n11Var3);
        u7e u7eVar2 = gi8Var.a;
        x70Var.j = u7eVar2;
        u7eVar2.q(oc7Var, i8 == 4 ? z2 : false);
        this.m.f();
        synchronized (this.r) {
        }
        this.i.execute(new jj2(this, 22, mf5Var));
        mf5 mf5Var2 = this.n;
        if (mf5Var2 == null || ((b87) mf5Var.c).y != ((b87) mf5Var2.c).y) {
            this.i.execute(new gf5(this, 0, mf5Var));
        }
        this.n = mf5Var;
    }

    public final void b() throws VideoFrameProcessingException {
        mf5 mf5Var;
        this.g.s();
        synchronized (this.r) {
            try {
                mf5Var = this.o;
                if (mf5Var != null) {
                    this.o = null;
                } else {
                    mf5Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mf5Var != null) {
            a(mf5Var, false);
        }
    }

    public final void c() {
        if (((u7e) this.f.j) != null) {
            final int i = 0;
            this.v = false;
            final int i2 = 1;
            try {
                u7e u7eVar = (u7e) this.f.j;
                u7eVar.getClass();
                u7eVar.a();
                this.g.k();
                u7eVar.n();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                if5 if5Var = new if5(0, countDownLatch);
                synchronized (u7eVar.b) {
                    u7eVar.c = if5Var;
                }
                o02 o02Var = this.g;
                final uu6 uu6Var = this.k;
                Objects.requireNonNull(uu6Var);
                o02Var.q(new pwi() { // from class: jf5
                    @Override // defpackage.pwi
                    public final void run() {
                        int i3 = i;
                        uu6 uu6Var2 = uu6Var;
                        switch (i3) {
                            case 0:
                                uu6Var2.flush();
                                break;
                            default:
                                if (uu6Var2.o != null) {
                                    p11 p11Var = uu6Var2.l;
                                    ArrayDeque arrayDeque = (ArrayDeque) p11Var.d;
                                    ArrayDeque arrayDeque2 = (ArrayDeque) p11Var.e;
                                    arrayDeque.addAll(arrayDeque2);
                                    arrayDeque2.clear();
                                    c70 c70Var = uu6Var2.m;
                                    c70Var.a = 0;
                                    c70Var.b = -1;
                                    c70Var.c = 0;
                                    c70 c70Var2 = uu6Var2.n;
                                    c70Var2.a = 0;
                                    c70Var2.b = -1;
                                    c70Var2.c = 0;
                                }
                                break;
                        }
                    }
                }, true);
                countDownLatch.await();
                synchronized (u7eVar.b) {
                    u7eVar.c = null;
                }
                o02 o02Var2 = this.g;
                final uu6 uu6Var2 = this.k;
                Objects.requireNonNull(uu6Var2);
                o02Var2.m(new pwi() { // from class: jf5
                    @Override // defpackage.pwi
                    public final void run() {
                        int i3 = i2;
                        uu6 uu6Var3 = uu6Var2;
                        switch (i3) {
                            case 0:
                                uu6Var3.flush();
                                break;
                            default:
                                if (uu6Var3.o != null) {
                                    p11 p11Var = uu6Var3.l;
                                    ArrayDeque arrayDeque = (ArrayDeque) p11Var.d;
                                    ArrayDeque arrayDeque2 = (ArrayDeque) p11Var.e;
                                    arrayDeque.addAll(arrayDeque2);
                                    arrayDeque2.clear();
                                    c70 c70Var = uu6Var3.m;
                                    c70Var.a = 0;
                                    c70Var.b = -1;
                                    c70Var.c = 0;
                                    c70 c70Var2 = uu6Var3.n;
                                    c70Var2.a = 0;
                                    c70Var2.b = -1;
                                    c70Var2.c = 0;
                                }
                                break;
                        }
                    }
                });
                this.g.m(new ff5(this, 1));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.i.execute(new hf5(this, e, 1));
            }
        }
    }

    public final boolean d(Bitmap bitmap, lf4 lf4Var) {
        lvb.b0(!this.v);
        boolean z = false;
        if (!this.m.e() || this.w) {
            return false;
        }
        if (ex3.h(this.s)) {
            if (Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
                z = true;
            }
            lvb.O("VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.", z);
        }
        oc7 oc7Var = this.u;
        oc7Var.getClass();
        u7e u7eVar = (u7e) this.f.j;
        u7eVar.getClass();
        u7eVar.i(bitmap, oc7Var, lf4Var);
        return true;
    }

    public final boolean e() {
        lvb.b0(!this.v);
        lvb.W(this.u, "registerInputStream must be called before registering input frames");
        if (!this.m.e() || this.w) {
            return false;
        }
        u7e u7eVar = (u7e) this.f.j;
        u7eVar.getClass();
        u7eVar.l(this.u);
        return true;
    }

    public final void f(int i, long j, b87 b87Var, List list) {
        b87 b87Var2;
        if (this.w) {
            return;
        }
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            ore.p(String.valueOf(i));
            return;
        }
        LinkedHashMap linkedHashMap = g55.a;
        synchronized (g55.class) {
        }
        float f = b87Var.A;
        if (f > 1.0f) {
            a87 a87VarA = b87Var.a();
            a87VarA.t = (int) (b87Var.u * f);
            a87VarA.z = 1.0f;
            b87Var2 = new b87(a87VarA);
        } else if (f < 1.0f) {
            a87 a87VarA2 = b87Var.a();
            a87VarA2.u = (int) (b87Var.v / f);
            a87VarA2.z = 1.0f;
            b87Var2 = new b87(a87VarA2);
        } else {
            b87Var2 = b87Var;
        }
        this.u = new oc7(b87Var2, j);
        try {
            this.m.a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.i.execute(new hf5(this, e, 0));
        }
        synchronized (this.r) {
            try {
                mf5 mf5Var = new mf5(i, j, b87Var, list);
                if (this.p) {
                    this.o = mf5Var;
                    this.m.d();
                    u7e u7eVar = (u7e) this.f.j;
                    u7eVar.getClass();
                    u7eVar.t();
                } else {
                    this.p = true;
                    this.m.d();
                    this.g.q(new zo2(this, 1, mf5Var), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        this.w = true;
        try {
            this.g.o(new ff5(this, 2));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            qr7.w(e);
        }
    }

    public final void h(bch bchVar) {
        uu6 uu6Var = this.k;
        uu6Var.getClass();
        try {
            uu6Var.h.m(new zo2(uu6Var, 3, bchVar));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            uu6Var.i.execute(new gf5(uu6Var, 27, e));
        }
    }

    public final void i() {
        g55.a();
        lvb.b0(!this.v);
        this.v = true;
        if (this.w) {
            return;
        }
        u7e u7eVar = (u7e) this.f.j;
        u7eVar.getClass();
        u7eVar.t();
    }
}
