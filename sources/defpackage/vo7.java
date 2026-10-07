package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class vo7 {
    public final Context a;
    public final ExecutorService b;
    public final ifh c = new ifh(new qo7(0, this));
    public final ny8 d = rx8.P(3, new h57(5));
    public final ny8 e = rx8.P(3, new h57(6));
    public final ny8 f = rx8.P(3, new h57(7));
    public final mjg g;
    public final r8e h;
    public final String i;

    public vo7(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
        mjg mjgVarA = p90.a(g0e.a);
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        this.i = vo7.class.getName();
    }

    public final Bitmap a(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) this.e.getValue());
        return bitmapCreateBitmap;
    }

    public final Bitmap b(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) this.f.getValue());
        return bitmapCreateBitmap;
    }

    public final Bitmap c(Uri uri) throws IOException {
        Context context = this.a;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            ore.p(zo5.l(uri, "Cannot open input stream for uri: "));
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            inputStreamOpenInputStream.close();
            options.inSampleSize = sb8.F(new Point(options.outWidth, options.outHeight), 1024, 1024);
            options.inJustDecodeBounds = false;
            InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream2 != null) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                    inputStreamOpenInputStream2.close();
                    if (bitmapDecodeStream != null) {
                        int iMax = Math.max(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        if (iMax <= 1024) {
                            return bitmapDecodeStream;
                        }
                        float f = 1024.0f / iMax;
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, (int) (bitmapDecodeStream.getWidth() * f), (int) (bitmapDecodeStream.getHeight() * f), true);
                        bitmapDecodeStream.recycle();
                        return bitmapCreateScaledBitmap;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(inputStreamOpenInputStream2, th);
                        throw th2;
                    }
                }
            }
            ore.p(zo5.l(uri, "Cannot open input stream for uri: "));
            return null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                rx8.n(inputStreamOpenInputStream, th3);
                throw th4;
            }
        }
    }

    public final Object d(op0 op0Var, vg8 vg8Var, nq4 nq4Var) {
        int i = 1;
        ek2 ek2Var = new ek2(1, p90.B(nq4Var));
        ek2Var.u();
        Task taskD = op0Var.D(vg8Var);
        ex8 ex8Var = new ex8(17, new iu(ek2Var, i));
        kam kamVar = (kam) taskD;
        kamVar.getClass();
        kamVar.e(vjh.a, ex8Var);
        kamVar.k(new fik(this, i, ek2Var));
        return ek2Var.s();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0110  */
    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    /* JADX WARN: Code duplicated, block: B:78:0x012b  */
    /* JADX WARN: Code duplicated, block: B:79:0x012d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:0x015a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (r1 == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
    
        if (r15 == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.net.Uri r14, defpackage.nq4 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo7.e(android.net.Uri, nq4):java.lang.Object");
    }

    public final Bitmap f(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) this.d.getValue());
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01c6 A[LOOP:1: B:101:0x01c0->B:103:0x01c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:75:0x0150 A[LOOP:2: B:73:0x014a->B:75:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x015b A[Catch: all -> 0x005b, Exception -> 0x005f, CancellationException -> 0x0063, TRY_ENTER, TryCatch #8 {CancellationException -> 0x0063, Exception -> 0x005f, all -> 0x005b, blocks: (B:25:0x0056, B:70:0x013b, B:77:0x015b, B:83:0x016d, B:80:0x0162, B:82:0x0168, B:34:0x006f, B:53:0x00e3, B:60:0x0103, B:66:0x0115, B:63:0x010a, B:65:0x0110), top: B:111:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:86:0x018e  */
    /* JADX WARN: Code duplicated, block: B:91:0x019b A[LOOP:0: B:89:0x0195->B:91:0x019b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ad A[Catch: all -> 0x003f, TryCatch #8 {all -> 0x003f, blocks: (B:14:0x003a, B:87:0x018f, B:93:0x01a6, B:99:0x01ba, B:96:0x01ad, B:98:0x01b5, B:105:0x01d1), top: B:111:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01b5 A[Catch: all -> 0x003f, TryCatch #8 {all -> 0x003f, blocks: (B:14:0x003a, B:87:0x018f, B:93:0x01a6, B:99:0x01ba, B:96:0x01ad, B:98:0x01b5, B:105:0x01d1), top: B:111:0x002d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a4c] */
    /* JADX WARN: Type inference failed for: r17v0, types: [vo7] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r3v0, types: [je9] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r8v14, types: [a4c] */
    /* JADX WARN: Type inference failed for: r8v5, types: [a4c] */
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
    public final Object g(op0 op0Var, Uri uri, nq4 nq4Var) throws Throwable {
        uo7 uo7Var;
        List list;
        String str;
        a4c a4cVar;
        je9 je9Var;
        Iterator it;
        Bitmap bitmapF;
        List list2;
        op0 op0Var2;
        Bitmap bitmap;
        List list3;
        String str2;
        ?? r8;
        Iterator it2;
        Iterator it3;
        op0 op0Var3 = op0Var;
        ?? r3 = je9.d;
        ?? r4 = "GoogleMlKit scanner grayscale ";
        if (nq4Var instanceof uo7) {
            uo7Var = (uo7) nq4Var;
            int i = uo7Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                uo7Var.i = i - Integer.MIN_VALUE;
            } else {
                uo7Var = new uo7(this, nq4Var);
            }
        } else {
            uo7Var = new uo7(this, nq4Var);
        }
        Object objD = uo7Var.g;
        hu4 hu4Var = hu4.a;
        int i2 = uo7Var.i;
        try {
            try {
                if (i2 == 0) {
                    ch3.d0(objD);
                    ArrayList arrayList = new ArrayList();
                    try {
                        Bitmap bitmapC = c(uri);
                        arrayList.add(bitmapC);
                        bitmapF = f(bitmapC);
                        arrayList.add(bitmapF);
                        String str3 = this.i;
                        ?? r14 = gm0.f;
                        if (r14 != 0 && r14.b(r3)) {
                            r14.c(r3, str3, "GoogleMlKit scanner grayscale " + bitmapF.getWidth() + "x" + bitmapF.getHeight(), null);
                        }
                        vg8 vg8VarA = vg8.a(bitmapF, 0);
                        uo7Var.d = op0Var3;
                        uo7Var.e = arrayList;
                        uo7Var.f = bitmapF;
                        uo7Var.i = 1;
                        Object objD2 = d(op0Var3, vg8VarA, uo7Var);
                        if (objD2 != hu4Var) {
                            list2 = arrayList;
                            objD = objD2;
                        }
                        return hu4Var;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        e = e2;
                        list = arrayList;
                        str = this.i;
                        a4cVar = gm0.f;
                        if (a4cVar == null) {
                            je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "GoogleMlKit scanner preprocessing failed", e);
                            }
                        }
                        r66 r66Var = r66.a;
                        it = list.iterator();
                        while (it.hasNext()) {
                            ((Bitmap) it.next()).recycle();
                        }
                        return r66Var;
                    } catch (Throwable th) {
                        th = th;
                        r3 = arrayList;
                        Iterator it4 = r3.iterator();
                        while (it4.hasNext()) {
                            ((Bitmap) it4.next()).recycle();
                        }
                        throw th;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = uo7Var.e;
                        try {
                            ch3.d0(objD);
                            list = list;
                            List list4 = (List) objD;
                            it3 = list.iterator();
                            while (it3.hasNext()) {
                                ((Bitmap) it3.next()).recycle();
                            }
                            return list4;
                        } catch (CancellationException e3) {
                            throw e3;
                        } catch (Exception e4) {
                            e = e4;
                            str = this.i;
                            a4cVar = gm0.f;
                            if (a4cVar == null) {
                                je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "GoogleMlKit scanner preprocessing failed", e);
                                }
                            }
                            r66 r66Var2 = r66.a;
                            it = list.iterator();
                            while (it.hasNext()) {
                                ((Bitmap) it.next()).recycle();
                            }
                            return r66Var2;
                        }
                    }
                    bitmap = uo7Var.f;
                    List list5 = uo7Var.e;
                    op0Var2 = uo7Var.d;
                    ch3.d0(objD);
                    r4 = list5;
                    list3 = (List) objD;
                    if (!list3.isEmpty()) {
                        it2 = r4.iterator();
                        while (it2.hasNext()) {
                            ((Bitmap) it2.next()).recycle();
                        }
                        return list3;
                    }
                    str2 = this.i;
                    r8 = gm0.f;
                    if (r8 != 0 && r8.b(r3)) {
                        r8.c(r3, str2, "GoogleMlKit scanner invert", null);
                    }
                    Bitmap bitmapB = b(bitmap);
                    ((Collection) r4).add(bitmapB);
                    vg8 vg8VarA2 = vg8.a(bitmapB, 0);
                    uo7Var.d = null;
                    uo7Var.e = (List) r4;
                    uo7Var.f = null;
                    uo7Var.i = 3;
                    objD = d(op0Var2, vg8VarA2, uo7Var);
                    if (objD != hu4Var) {
                        list = r4;
                        List list6 = (List) objD;
                        it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((Bitmap) it3.next()).recycle();
                        }
                        return list6;
                    }
                    return hu4Var;
                }
                Bitmap bitmap2 = uo7Var.f;
                List list7 = uo7Var.e;
                op0 op0Var4 = uo7Var.d;
                ch3.d0(objD);
                bitmapF = bitmap2;
                op0Var3 = op0Var4;
                list2 = list7;
                List list8 = (List) objD;
                if (!list8.isEmpty()) {
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        ((Bitmap) it5.next()).recycle();
                    }
                    return list8;
                }
                String str4 = this.i;
                ?? r9 = gm0.f;
                if (r9 != 0 && r9.b(r3)) {
                    r9.c(r3, str4, "GoogleMlKit scanner binarize", null);
                }
                Bitmap bitmapA = a(bitmapF);
                list2.add(bitmapA);
                vg8 vg8VarA3 = vg8.a(bitmapA, 0);
                uo7Var.d = op0Var3;
                uo7Var.e = list2;
                uo7Var.f = bitmapF;
                uo7Var.i = 2;
                objD = d(op0Var3, vg8VarA3, uo7Var);
                if (objD != hu4Var) {
                    Bitmap bitmap3 = bitmapF;
                    op0Var2 = op0Var3;
                    bitmap = bitmap3;
                    r4 = list2;
                    list3 = (List) objD;
                    if (!list3.isEmpty()) {
                        it2 = r4.iterator();
                        while (it2.hasNext()) {
                            ((Bitmap) it2.next()).recycle();
                        }
                        return list3;
                    }
                    str2 = this.i;
                    r8 = gm0.f;
                    if (r8 != 0) {
                        r8.c(r3, str2, "GoogleMlKit scanner invert", null);
                    }
                    Bitmap bitmapB2 = b(bitmap);
                    ((Collection) r4).add(bitmapB2);
                    vg8 vg8VarA4 = vg8.a(bitmapB2, 0);
                    uo7Var.d = null;
                    uo7Var.e = (List) r4;
                    uo7Var.f = null;
                    uo7Var.i = 3;
                    objD = d(op0Var2, vg8VarA4, uo7Var);
                    if (objD != hu4Var) {
                        list = r4;
                        List list9 = (List) objD;
                        it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((Bitmap) it3.next()).recycle();
                        }
                        return list9;
                    }
                }
                return hu4Var;
            } catch (CancellationException e5) {
                throw e5;
            } catch (Exception e6) {
                e = e6;
                list = r4;
            } catch (Throwable th2) {
                th = th2;
                r3 = r4;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
