package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class dyg {
    public final e5d a;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final Paint i;
    public final Paint j;
    public final Matrix k;
    public final Matrix l;
    public final RectF m;
    public final Paint n;
    public final ifh o;
    public final String b = dyg.class.getName();
    public final ifh h = new ifh(new bpg(2, this));

    public dyg(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, e5d e5dVar) {
        this.a = e5dVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
        this.g = ny8Var5;
        Paint paint = new Paint(1);
        paint.setDither(true);
        paint.setColor(-7829368);
        this.i = paint;
        this.j = new Paint(3);
        this.k = new Matrix();
        this.l = new Matrix();
        this.m = new RectF();
        Paint paint2 = new Paint();
        paint2.setColor(452984831);
        this.n = paint2;
        this.o = new ifh(new yvg(4));
    }

    public static final Object a(dyg dygVar, Uri uri, int i, int i2, boolean z) throws IOException {
        int i3;
        int i4;
        Object poeVar;
        int i5;
        dygVar.getClass();
        je9 je9Var = je9.f;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream inputStreamOpenInputStream = dygVar.i().getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            try {
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                inputStreamOpenInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(inputStreamOpenInputStream, th);
                    throw th2;
                }
            }
        }
        int i6 = options.outWidth;
        if (i6 <= 0 || (i3 = options.outHeight) <= 0) {
            String str = dygVar.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                int i7 = options.outWidth;
                int i8 = options.outHeight;
                StringBuilder sb = new StringBuilder("decodeBitmap: failed to read bounds for ");
                sb.append(uri);
                sb.append(" (");
                sb.append(i7);
                sb.append("x");
                a4cVar.c(je9Var, str, zo5.t(sb, i8, ")"), null);
            }
        } else {
            if (i3 > i2 || i6 > i) {
                int i9 = i3 / 2;
                int i10 = i6 / 2;
                i4 = 1;
                while (i9 / i4 >= i2 && i10 / i4 >= i) {
                    i4 *= 2;
                }
            } else {
                i4 = 1;
            }
            options.inSampleSize = i4;
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = z ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            InputStream inputStreamOpenInputStream2 = dygVar.i().getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream2 != null) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                    inputStreamOpenInputStream2.close();
                    if (bitmapDecodeStream != null) {
                        try {
                            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = dygVar.i().getContentResolver().openFileDescriptor(uri, "r");
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                try {
                                    int attributeInt = new ExifInterface(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).getAttributeInt("Orientation", 1);
                                    if (attributeInt == 3) {
                                        i5 = 180;
                                    } else if (attributeInt != 6) {
                                        i5 = attributeInt != 8 ? 0 : 270;
                                    } else {
                                        i5 = 90;
                                    }
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        rx8.n(parcelFileDescriptorOpenFileDescriptor, th3);
                                        throw th4;
                                    }
                                }
                            } else {
                                i5 = 0;
                            }
                            poeVar = new Integer(i5);
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th5) {
                            poeVar = new poe(th5);
                        }
                        Throwable thA = roe.a(poeVar);
                        if (thA != null) {
                            String str2 = dygVar.b;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str2, "readExifRotation failed", thA);
                            }
                        }
                        Integer num = new Integer(0);
                        if (poeVar instanceof poe) {
                            poeVar = num;
                        }
                        int iIntValue = ((Number) poeVar).intValue();
                        Object poeVar2 = bitmapDecodeStream;
                        if (iIntValue != 0) {
                            try {
                                Matrix matrix = new Matrix();
                                matrix.setRotate(iIntValue);
                                poeVar2 = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                            } catch (CancellationException e2) {
                                throw e2;
                            } catch (Throwable th6) {
                                poeVar2 = new poe(th6);
                            }
                        }
                        Throwable thA2 = roe.a(poeVar2);
                        if (thA2 != null) {
                            String str3 = dygVar.b;
                            a4c a4cVar3 = gm0.f;
                            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                                a4cVar3.c(je9Var, str3, "applyRotation failed", thA2);
                            }
                        }
                        if (poeVar2 instanceof poe) {
                            return null;
                        }
                        return poeVar2;
                    }
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        rx8.n(inputStreamOpenInputStream2, th7);
                        throw th8;
                    }
                }
            }
        }
        return null;
    }

    public static final void b(dyg dygVar, Canvas canvas, Bitmap bitmap, int i, int i2) {
        dygVar.getClass();
        Object poeVar = sbi.a;
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            String str = dygVar.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, nbh.u("drawBlurredBackground: invalid source ", bitmap.getWidth(), "x", bitmap.getHeight(), ", solid fallback"), null);
                }
            }
            canvas.drawRect(0.0f, 0.0f, i, i2, dygVar.i);
            return;
        }
        int i3 = i / 8;
        if (i3 < 1) {
            i3 = 1;
        }
        int width = bitmap.getWidth();
        if (i3 > width) {
            i3 = width;
        }
        int iK = gm0.K((i3 * bitmap.getHeight()) / bitmap.getWidth());
        if (iK < 1) {
            iK = 1;
        }
        au3 au3VarD = ((k2d) dygVar.e.getValue()).d(bitmap, i3, iK, true);
        au3 au3VarC = ((k2d) dygVar.e.getValue()).c(i3, iK, Bitmap.Config.ARGB_8888);
        try {
            Bitmap bitmap2 = (Bitmap) au3VarC.K();
            try {
                try {
                    ((jxb) dygVar.h.getValue()).d(bitmap2, (Bitmap) au3VarD.K());
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                gm0.V(dygVar.b, null, new xxg("Blur failed, using solid background fallback", thA));
                canvas.drawRect(0.0f, 0.0f, i, i2, dygVar.i);
            } else {
                dygVar.h(canvas, bitmap2, i, i2);
            }
            au3VarC.close();
            au3VarD.close();
        } catch (Throwable th2) {
            au3VarC.close();
            au3VarD.close();
            throw th2;
        }
    }

    public static final void c(dyg dygVar, Canvas canvas, List list, int i, int i2, int i3, int i4) {
        boolean z;
        float f;
        float f2;
        dygVar.getClass();
        boolean z2 = i > 0 && i2 > 0;
        f59 f59Var = null;
        if (!z2) {
            String str = dygVar.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, nbh.u("drawCanvasLayers: canvas is ", i, "x", i2, ", text layers are skipped"), null);
                }
            }
        }
        float f3 = z2 ? i3 / i : 0.0f;
        float f4 = z2 ? i4 / i2 : 0.0f;
        float fSqrt = z2 ? dygVar.i().getResources().getDisplayMetrics().density * ((float) Math.sqrt(f3 * f4)) : 0.0f;
        Rect rect = new Rect(0, 0, i3, i4);
        if (z2) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((vk2) it.next()) instanceof tk2) {
                        f59Var = new f59(dygVar.i(), fSqrt);
                        break;
                    }
                }
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            vk2 vk2Var = (vk2) it2.next();
            if (vk2Var instanceof sk2) {
                lu5 lu5Var = ((sk2) vk2Var).a;
                AbstractMap.SimpleEntry simpleEntryA = jy8.a(lu5Var.b, lu5Var.c, rect);
                if (simpleEntryA == null) {
                    continue;
                } else {
                    int iSave = canvas.save();
                    try {
                        canvas.clipRect(rect);
                        ((x26) simpleEntryA.getValue()).draw(canvas);
                        canvas.restoreToCount(iSave);
                    } catch (Throwable th) {
                        canvas.restoreToCount(iSave);
                        throw th;
                    }
                }
            } else {
                if (!(vk2Var instanceof uk2)) {
                    z = z2;
                    f = f3;
                    if (!(vk2Var instanceof tk2)) {
                        ore.o();
                        return;
                    }
                    if (f59Var != null) {
                        g59 g59Var = ((tk2) vk2Var).a;
                        Matrix matrix = dygVar.l;
                        RectF rectF = dygVar.m;
                        float f5 = g59Var.h;
                        f2 = f5 >= 0.1f ? f5 : 0.1f;
                        f59Var.b(g59Var, rectF);
                        float f6 = g59Var.f * f;
                        float f7 = g59Var.g * f4;
                        float f8 = g59Var.i;
                        float fCenterX = rectF.centerX();
                        float fCenterY = rectF.centerY();
                        matrix.reset();
                        matrix.postTranslate(-fCenterX, -fCenterY);
                        matrix.postScale(f2, f2);
                        matrix.postRotate(f8);
                        matrix.postTranslate(f6, f7);
                        int iSave2 = canvas.save();
                        try {
                            canvas.concat(matrix);
                            f59Var.a(canvas);
                            canvas.restoreToCount(iSave2);
                        } catch (Throwable th2) {
                            canvas.restoreToCount(iSave2);
                            throw th2;
                        }
                    }
                } else if (z2) {
                    umh umhVar = ((uk2) vk2Var).a;
                    Matrix matrix2 = dygVar.k;
                    float f9 = umhVar.j;
                    f2 = f9 >= 0.1f ? f9 : 0.1f;
                    float f10 = umhVar.h * f3;
                    float f11 = umhVar.i * f4;
                    float f12 = umhVar.k;
                    float f13 = umhVar.l * f3;
                    z = z2;
                    float f14 = umhVar.m * f4;
                    matrix2.reset();
                    matrix2.postTranslate(-f13, -f14);
                    matrix2.postScale(f2, f2);
                    matrix2.postRotate(f12);
                    matrix2.postTranslate(f10, f11);
                    int iSave3 = canvas.save();
                    try {
                        canvas.concat(matrix2);
                        float f15 = fSqrt;
                        f = f3;
                        wwl.b(canvas, umhVar, dygVar.i(), f15, f, (f66) dygVar.g.getValue());
                        fSqrt = f15;
                        canvas.restoreToCount(iSave3);
                    } catch (Throwable th3) {
                        canvas.restoreToCount(iSave3);
                        throw th3;
                    }
                } else {
                    continue;
                }
                f3 = f;
                z2 = z;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(dyg dygVar, Canvas canvas, Uri uri, int i, int i2, nq4 nq4Var) {
        zxg zxgVar;
        dygVar.getClass();
        if (nq4Var instanceof zxg) {
            zxgVar = (zxg) nq4Var;
            int i3 = zxgVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zxgVar.i = i3 - Integer.MIN_VALUE;
            } else {
                zxgVar = new zxg(dygVar, nq4Var);
            }
        } else {
            zxgVar = new zxg(dygVar, nq4Var);
        }
        Object poeVar = zxgVar.g;
        hu4 hu4Var = hu4.a;
        int i4 = zxgVar.i;
        try {
            if (i4 == 0) {
                ch3.d0(poeVar);
                me7 me7Var = (me7) dygVar.f.getValue();
                zxgVar.d = canvas;
                zxgVar.e = i;
                zxgVar.f = i2;
                zxgVar.i = 1;
                poeVar = me7Var.a(uri, zxgVar);
                if (poeVar == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i4 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = zxgVar.f;
                i = zxgVar.e;
                canvas = zxgVar.d;
                ch3.d0(poeVar);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str = dygVar.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, c0a.o("drawEditorBlurBackground: blur fetch failed (", thA.getMessage(), "), using local fallback"), null);
                }
            }
        }
        Bitmap bitmap = (Bitmap) (poeVar instanceof poe ? null : poeVar);
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return Boolean.FALSE;
        }
        try {
            dygVar.h(canvas, bitmap, i, i2);
            return Boolean.TRUE;
        } finally {
            rel.b(bitmap);
        }
    }

    public static final void e(dyg dygVar, Canvas canvas, Bitmap bitmap, RectF rectF, i6a i6aVar, int i, int i2, int i3, int i4) {
        Paint paint = dygVar.j;
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        if (i6aVar == null || i <= 0 || i2 <= 0) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
            return;
        }
        float f = i3 / i;
        float f2 = i4 / i2;
        int iSave = canvas.save();
        try {
            canvas.translate(i6aVar.a * f, i6aVar.b * f2);
            canvas.rotate(i6aVar.d);
            float f3 = i6aVar.c;
            canvas.scale(f3, f3);
            canvas.translate((-i6aVar.e) * f, (-i6aVar.f) * f2);
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x033f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0354 A[Catch: all -> 0x0319, TryCatch #12 {all -> 0x0319, blocks: (B:99:0x0332, B:102:0x0354, B:104:0x035c, B:85:0x02cf, B:87:0x02d9), top: B:175:0x02cf }] */
    /* JADX WARN: Code duplicated, block: B:104:0x035c A[Catch: all -> 0x0319, TRY_LEAVE, TryCatch #12 {all -> 0x0319, blocks: (B:99:0x0332, B:102:0x0354, B:104:0x035c, B:85:0x02cf, B:87:0x02d9), top: B:175:0x02cf }] */
    /* JADX WARN: Code duplicated, block: B:111:0x03a1 A[Catch: all -> 0x03cc, TryCatch #3 {all -> 0x03cc, blocks: (B:108:0x0385, B:119:0x03d8, B:111:0x03a1, B:113:0x03a7), top: B:161:0x0385 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0430  */
    /* JADX WARN: Code duplicated, block: B:147:0x0446  */
    /* JADX WARN: Code duplicated, block: B:150:0x044b  */
    /* JADX WARN: Code duplicated, block: B:151:0x044d  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01bc A[Catch: all -> 0x01d6, CancellationException -> 0x044f, TRY_ENTER, TryCatch #7 {CancellationException -> 0x044f, blocks: (B:121:0x03e6, B:141:0x0420, B:142:0x0423, B:29:0x00f6, B:56:0x01ab, B:59:0x01bc, B:62:0x01da, B:65:0x01e9, B:67:0x01ef, B:39:0x012b, B:51:0x0170, B:42:0x0138, B:50:0x0150), top: B:165:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01da A[Catch: all -> 0x01d6, CancellationException -> 0x044f, TryCatch #7 {CancellationException -> 0x044f, blocks: (B:121:0x03e6, B:141:0x0420, B:142:0x0423, B:29:0x00f6, B:56:0x01ab, B:59:0x01bc, B:62:0x01da, B:65:0x01e9, B:67:0x01ef, B:39:0x012b, B:51:0x0170, B:42:0x0138, B:50:0x0150), top: B:165:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x002e  */
    /* JADX WARN: Code duplicated, block: B:84:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d9 A[Catch: all -> 0x0319, TRY_LEAVE, TryCatch #12 {all -> 0x0319, blocks: (B:99:0x0332, B:102:0x0354, B:104:0x035c, B:85:0x02cf, B:87:0x02d9), top: B:175:0x02cf }] */
    /* JADX WARN: Code duplicated, block: B:90:0x030a  */
    /* JADX WARN: Code duplicated, block: B:96:0x031b  */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x01bc, please report this as an issue */
    public static final Object f(dyg dygVar, Uri uri, List list, int i, int i2, int i3, int i4, boolean z, i6a i6aVar, nq4 nq4Var) {
        ayg aygVar;
        String str;
        Object poeVar;
        int i5;
        Throwable thA;
        Object obj;
        i6a i6aVar2;
        int i6;
        int i7;
        List list2;
        Object obj2;
        int i8;
        Bitmap.Config config;
        int i9;
        Bitmap bitmap;
        String str2;
        a4c a4cVar;
        au3 au3VarC;
        au3 au3Var;
        RectF rectFA;
        String str3;
        a4c a4cVar2;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        Object objD;
        dyg dygVar2;
        Canvas canvas;
        hu4 hu4Var;
        RectF rectF;
        Object obj3;
        i6a i6aVar3;
        int i14;
        au3 au3Var2;
        int i15;
        int i16;
        List list3;
        i6a i6aVar4;
        int i17;
        Canvas canvas2;
        List list4;
        Bitmap bitmap2;
        String str4;
        a4c a4cVar3;
        je9 je9Var;
        int i18;
        int i19;
        String str5;
        a4c a4cVar4;
        dyg dygVar3 = dygVar;
        Uri uri2 = uri;
        int i20 = i3;
        int i21 = i4;
        boolean z3 = z;
        dygVar3.getClass();
        je9 je9Var2 = je9.d;
        String str6 = "StoryImageRenderer: failed to decode image from ";
        if (nq4Var instanceof ayg) {
            aygVar = (ayg) nq4Var;
            int i22 = aygVar.u;
            if ((i22 & Integer.MIN_VALUE) != 0) {
                aygVar.u = i22 - Integer.MIN_VALUE;
            } else {
                aygVar = new ayg(dygVar3, nq4Var);
            }
        } else {
            aygVar = new ayg(dygVar3, nq4Var);
        }
        Object obj4 = aygVar.s;
        hu4 hu4Var2 = hu4.a;
        int i23 = aygVar.u;
        String str7 = "x";
        String str8 = ", ";
        try {
            try {
                if (i23 == 0) {
                    ch3.d0(obj4);
                    Bitmap.Config config2 = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                    try {
                        String str9 = dygVar3.b;
                        a4c a4cVar5 = gm0.f;
                        if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                            a4cVar5.c(je9Var2, str9, "StoryImageRenderer: render started (" + i20 + "x" + i21 + ", " + (z3 ? "ARGB_8888" : "RGB_565") + ")", null);
                        }
                        aygVar.d = uri2;
                        aygVar.e = list;
                        i6aVar2 = i6aVar;
                        aygVar.f = i6aVar2;
                        aygVar.g = config2;
                        i6 = i;
                        aygVar.l = i6;
                        i7 = i2;
                        aygVar.m = i7;
                        aygVar.n = i20;
                        aygVar.o = i21;
                        aygVar.r = z3;
                        aygVar.p = 0;
                        aygVar.q = 0;
                        aygVar.u = 1;
                        Object objA = a(dygVar3, uri2, i20, i21, z3);
                        hu4Var2 = hu4Var2;
                        if (objA == hu4Var2) {
                            return hu4Var2;
                        }
                        list2 = list;
                        str7 = "x";
                        obj2 = objA;
                        i8 = 0;
                        config = config2;
                        i5 = i20;
                        i9 = 0;
                        str = ")";
                        bitmap = (Bitmap) obj2;
                        vd7.q(aygVar.getContext());
                        str2 = dygVar3.b;
                        if (bitmap == null) {
                            gm0.V(str2, null, new iwg(str6 + uri2));
                            poeVar = null;
                        } else {
                            Uri uri3 = uri2;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4cVar.c(je9Var2, str2, "StoryImageRenderer: baseBitmap was decoded, w: " + bitmap.getWidth() + ", h: " + bitmap.getHeight() + ", creating output bitmap", null);
                            }
                            au3VarC = ((k2d) dygVar3.e.getValue()).c(i5, i21, config);
                            Canvas canvas3 = new Canvas((Bitmap) au3VarC.K());
                            vd7.q(aygVar.getContext());
                            rectFA = rsl.a(bitmap.getWidth(), bitmap.getHeight(), i5, i21);
                            vd7.q(aygVar.getContext());
                            str3 = dygVar3.b;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                a4cVar2.c(je9Var2, str3, "StoryImageRenderer: photoRect: " + rectFA, null);
                            }
                            aygVar.d = null;
                            aygVar.e = list2;
                            aygVar.f = i6aVar2;
                            aygVar.g = null;
                            aygVar.h = bitmap;
                            aygVar.i = au3VarC;
                            aygVar.j = canvas3;
                            aygVar.k = rectFA;
                            aygVar.l = i6;
                            aygVar.m = i7;
                            aygVar.n = i5;
                            aygVar.o = i21;
                            z2 = z3;
                            aygVar.r = z2;
                            i10 = i8;
                            aygVar.p = i10;
                            i11 = i9;
                            aygVar.q = i11;
                            aygVar.u = 2;
                            i12 = i21;
                            i13 = i5;
                            ayg aygVar2 = aygVar;
                            objD = d(dygVar3, canvas3, uri3, i13, i12, aygVar2);
                            dygVar2 = dygVar3;
                            canvas = canvas3;
                            aygVar = aygVar2;
                            hu4Var = hu4Var2;
                            if (objD == hu4Var) {
                                return hu4Var;
                            }
                            rectF = rectFA;
                            obj3 = objD;
                            i6aVar3 = i6aVar2;
                            i14 = i7;
                            au3Var2 = au3VarC;
                            i15 = i12;
                            i16 = i13;
                            list3 = list2;
                            if (((Boolean) obj3).booleanValue()) {
                                je9Var2 = je9Var2;
                            } else {
                                aygVar.d = null;
                                aygVar.e = list3;
                                aygVar.f = i6aVar3;
                                aygVar.g = null;
                                aygVar.h = bitmap;
                                aygVar.i = au3Var2;
                                aygVar.j = canvas;
                                aygVar.k = rectF;
                                aygVar.l = i6;
                                aygVar.m = i14;
                                aygVar.n = i16;
                                aygVar.o = i15;
                                aygVar.r = z2;
                                aygVar.p = i10;
                                aygVar.q = i11;
                                aygVar.u = 3;
                                b(dygVar2, canvas, bitmap, i16, i15);
                                if (sbi.a == hu4Var) {
                                    return hu4Var;
                                }
                                i6aVar4 = i6aVar3;
                                i17 = i14;
                                canvas2 = canvas;
                                list4 = list3;
                                i6aVar3 = i6aVar4;
                                list3 = list4;
                                canvas = canvas2;
                                i14 = i17;
                            }
                            canvas.drawRect(0.0f, 0.0f, i16, i15, dygVar2.n);
                            vd7.q(aygVar.getContext());
                            str4 = dygVar2.b;
                            a4cVar3 = gm0.f;
                            if (a4cVar3 == null) {
                                je9Var = je9Var2;
                            } else {
                                je9Var = je9Var2;
                                if (a4cVar3.b(je9Var)) {
                                    a4cVar3.c(je9Var, str4, "StoryImageRenderer: starting drawPhoto", null);
                                }
                            }
                            e(dygVar2, canvas, bitmap, rectF, i6aVar3, i6, i14, i16, i15);
                            dyg dygVar4 = dygVar2;
                            Canvas canvas4 = canvas;
                            bitmap = bitmap;
                            i18 = i6;
                            i19 = i14;
                            int i24 = i16;
                            int i25 = i15;
                            vd7.q(aygVar.getContext());
                            str5 = dygVar4.b;
                            a4cVar4 = gm0.f;
                            if (a4cVar4 != null) {
                                int size = list3.size();
                                StringBuilder sb = new StringBuilder("StoryImageRenderer: starting storyLayers ");
                                sb.append(size);
                                String str10 = str8;
                                sb.append(str10);
                                sb.append(i18);
                                sb.append(str10);
                                sb.append(i19);
                                a4cVar4.c(je9Var, str5, sb.toString(), null);
                            }
                            c(dygVar4, canvas4, list3, i18, i19, i24, i25);
                            dygVar3 = dygVar4;
                            vd7.q(aygVar.getContext());
                            au3 au3VarClone = au3Var2.clone();
                            au3Var2.close();
                            rel.b(bitmap);
                            poeVar = au3VarClone;
                            i5 = i24;
                            i21 = i25;
                        }
                        thA = roe.a(poeVar);
                        if (thA != null) {
                            obj = null;
                            gm0.V(dygVar3.b, null, new yxg(nbh.u("StoryImageRenderer: render failed (", i5, str7, i21, str), thA));
                        } else {
                            obj = null;
                        }
                        if (poeVar instanceof poe) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        str = ")";
                        poeVar = new poe(th);
                        i5 = i20;
                        thA = roe.a(poeVar);
                        if (thA != null) {
                            obj = null;
                            gm0.V(dygVar3.b, null, new yxg(nbh.u("StoryImageRenderer: render failed (", i5, str7, i21, str), thA));
                        } else {
                            obj = null;
                        }
                        if (poeVar instanceof poe) {
                        }
                    }
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (i23 == 1) {
                                        int i26 = aygVar.q;
                                        int i27 = aygVar.p;
                                        boolean z4 = aygVar.r;
                                        int i28 = aygVar.o;
                                        i5 = aygVar.n;
                                        i7 = aygVar.m;
                                        int i29 = aygVar.l;
                                        Bitmap.Config config3 = aygVar.g;
                                        i6a i6aVar5 = aygVar.f;
                                        List list5 = aygVar.e;
                                        uri2 = aygVar.d;
                                        try {
                                            ch3.d0(obj4);
                                            i8 = i27;
                                            i9 = i26;
                                            str7 = "x";
                                            z3 = z4;
                                            i21 = i28;
                                            list2 = list5;
                                            obj2 = obj4;
                                            str6 = "StoryImageRenderer: failed to decode image from ";
                                            i6 = i29;
                                            config = config3;
                                            i6aVar2 = i6aVar5;
                                            str = ")";
                                            try {
                                                bitmap = (Bitmap) obj2;
                                                vd7.q(aygVar.getContext());
                                                str2 = dygVar3.b;
                                                if (bitmap == null) {
                                                    gm0.V(str2, null, new iwg(str6 + uri2));
                                                    poeVar = null;
                                                } else {
                                                    Uri uri4 = uri2;
                                                    a4cVar = gm0.f;
                                                    if (a4cVar != null && a4cVar.b(je9Var2)) {
                                                        a4cVar.c(je9Var2, str2, "StoryImageRenderer: baseBitmap was decoded, w: " + bitmap.getWidth() + ", h: " + bitmap.getHeight() + ", creating output bitmap", null);
                                                    }
                                                    try {
                                                        au3VarC = ((k2d) dygVar3.e.getValue()).c(i5, i21, config);
                                                        try {
                                                            Canvas canvas5 = new Canvas((Bitmap) au3VarC.K());
                                                            vd7.q(aygVar.getContext());
                                                            rectFA = rsl.a(bitmap.getWidth(), bitmap.getHeight(), i5, i21);
                                                            vd7.q(aygVar.getContext());
                                                            str3 = dygVar3.b;
                                                            a4cVar2 = gm0.f;
                                                            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                                                                a4cVar2.c(je9Var2, str3, "StoryImageRenderer: photoRect: " + rectFA, null);
                                                            }
                                                            aygVar.d = null;
                                                            aygVar.e = list2;
                                                            aygVar.f = i6aVar2;
                                                            aygVar.g = null;
                                                            aygVar.h = bitmap;
                                                            aygVar.i = au3VarC;
                                                            aygVar.j = canvas5;
                                                            aygVar.k = rectFA;
                                                            aygVar.l = i6;
                                                            aygVar.m = i7;
                                                            aygVar.n = i5;
                                                            aygVar.o = i21;
                                                            z2 = z3;
                                                            aygVar.r = z2;
                                                            i10 = i8;
                                                            aygVar.p = i10;
                                                            i11 = i9;
                                                            aygVar.q = i11;
                                                            aygVar.u = 2;
                                                            i12 = i21;
                                                            i13 = i5;
                                                            ayg aygVar3 = aygVar;
                                                            try {
                                                                objD = d(dygVar3, canvas5, uri4, i13, i12, aygVar3);
                                                                dygVar2 = dygVar3;
                                                                canvas = canvas5;
                                                                aygVar = aygVar3;
                                                                hu4Var = hu4Var2;
                                                                if (objD == hu4Var) {
                                                                    return hu4Var;
                                                                }
                                                                rectF = rectFA;
                                                                obj3 = objD;
                                                                i6aVar3 = i6aVar2;
                                                                i14 = i7;
                                                                au3Var2 = au3VarC;
                                                                i15 = i12;
                                                                i16 = i13;
                                                                list3 = list2;
                                                                if (((Boolean) obj3).booleanValue()) {
                                                                    aygVar.d = null;
                                                                    aygVar.e = list3;
                                                                    aygVar.f = i6aVar3;
                                                                    aygVar.g = null;
                                                                    aygVar.h = bitmap;
                                                                    aygVar.i = au3Var2;
                                                                    aygVar.j = canvas;
                                                                    aygVar.k = rectF;
                                                                    aygVar.l = i6;
                                                                    aygVar.m = i14;
                                                                    aygVar.n = i16;
                                                                    aygVar.o = i15;
                                                                    aygVar.r = z2;
                                                                    aygVar.p = i10;
                                                                    aygVar.q = i11;
                                                                    aygVar.u = 3;
                                                                    b(dygVar2, canvas, bitmap, i16, i15);
                                                                    if (sbi.a == hu4Var) {
                                                                        return hu4Var;
                                                                    }
                                                                    i6aVar4 = i6aVar3;
                                                                    i17 = i14;
                                                                    canvas2 = canvas;
                                                                    list4 = list3;
                                                                } else {
                                                                    je9Var2 = je9Var2;
                                                                }
                                                                canvas.drawRect(0.0f, 0.0f, i16, i15, dygVar2.n);
                                                                vd7.q(aygVar.getContext());
                                                                str4 = dygVar2.b;
                                                                a4cVar3 = gm0.f;
                                                                if (a4cVar3 == null) {
                                                                    je9Var = je9Var2;
                                                                } else {
                                                                    je9Var = je9Var2;
                                                                    if (a4cVar3.b(je9Var)) {
                                                                        a4cVar3.c(je9Var, str4, "StoryImageRenderer: starting drawPhoto", null);
                                                                    }
                                                                }
                                                                e(dygVar2, canvas, bitmap, rectF, i6aVar3, i6, i14, i16, i15);
                                                                dyg dygVar5 = dygVar2;
                                                                Canvas canvas6 = canvas;
                                                                bitmap = bitmap;
                                                                i18 = i6;
                                                                i19 = i14;
                                                                int i210 = i16;
                                                                int i211 = i15;
                                                                vd7.q(aygVar.getContext());
                                                                str5 = dygVar5.b;
                                                                a4cVar4 = gm0.f;
                                                                if (a4cVar4 != null) {
                                                                    int size2 = list3.size();
                                                                    StringBuilder sb2 = new StringBuilder("StoryImageRenderer: starting storyLayers ");
                                                                    sb2.append(size2);
                                                                    String str11 = str8;
                                                                    sb2.append(str11);
                                                                    sb2.append(i18);
                                                                    sb2.append(str11);
                                                                    sb2.append(i19);
                                                                    a4cVar4.c(je9Var, str5, sb2.toString(), null);
                                                                }
                                                                c(dygVar5, canvas6, list3, i18, i19, i210, i211);
                                                                dygVar3 = dygVar5;
                                                                vd7.q(aygVar.getContext());
                                                                au3 au3VarClone2 = au3Var2.clone();
                                                                au3Var2.close();
                                                                rel.b(bitmap);
                                                                poeVar = au3VarClone2;
                                                                i5 = i210;
                                                                i21 = i211;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                i5 = i13;
                                                                i21 = i12;
                                                                au3Var = au3VarC;
                                                                bitmap2 = bitmap;
                                                                au3.E(au3Var);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                i20 = i5;
                                                poeVar = new poe(th);
                                                i5 = i20;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            i21 = i28;
                                            i20 = i5;
                                            str = ")";
                                            poeVar = new poe(th);
                                            i5 = i20;
                                            thA = roe.a(poeVar);
                                            if (thA != null) {
                                                obj = null;
                                                gm0.V(dygVar3.b, null, new yxg(nbh.u("StoryImageRenderer: render failed (", i5, str7, i21, str), thA));
                                            } else {
                                                obj = null;
                                            }
                                            if (poeVar instanceof poe) {
                                            }
                                        }
                                        thA = roe.a(poeVar);
                                        if (thA != null) {
                                            obj = null;
                                            gm0.V(dygVar3.b, null, new yxg(nbh.u("StoryImageRenderer: render failed (", i5, str7, i21, str), thA));
                                        } else {
                                            obj = null;
                                        }
                                        if (poeVar instanceof poe) {
                                        }
                                    }
                                    if (i23 == 2) {
                                        int i30 = aygVar.q;
                                        int i31 = aygVar.p;
                                        boolean z5 = aygVar.r;
                                        int i32 = aygVar.o;
                                        int i33 = aygVar.n;
                                        i14 = aygVar.m;
                                        i6 = aygVar.l;
                                        RectF rectF2 = aygVar.k;
                                        canvas = aygVar.j;
                                        au3 au3Var3 = aygVar.i;
                                        Bitmap bitmap3 = aygVar.h;
                                        i6a i6aVar6 = aygVar.f;
                                        List list6 = aygVar.e;
                                        try {
                                            ch3.d0(obj4);
                                            z2 = z5;
                                            i16 = i33;
                                            rectF = rectF2;
                                            au3Var2 = au3Var3;
                                            str7 = "x";
                                            str = ")";
                                            i10 = i31;
                                            list3 = list6;
                                            bitmap = bitmap3;
                                            i15 = i32;
                                            hu4Var = hu4Var2;
                                            i11 = i30;
                                            dygVar2 = dygVar3;
                                            i6aVar3 = i6aVar6;
                                            obj3 = obj4;
                                            try {
                                                if (((Boolean) obj3).booleanValue()) {
                                                    aygVar.d = null;
                                                    aygVar.e = list3;
                                                    aygVar.f = i6aVar3;
                                                    aygVar.g = null;
                                                    aygVar.h = bitmap;
                                                    aygVar.i = au3Var2;
                                                    aygVar.j = canvas;
                                                    aygVar.k = rectF;
                                                    aygVar.l = i6;
                                                    aygVar.m = i14;
                                                    aygVar.n = i16;
                                                    aygVar.o = i15;
                                                    aygVar.r = z2;
                                                    aygVar.p = i10;
                                                    aygVar.q = i11;
                                                    aygVar.u = 3;
                                                    b(dygVar2, canvas, bitmap, i16, i15);
                                                    if (sbi.a == hu4Var) {
                                                        return hu4Var;
                                                    }
                                                    i6aVar4 = i6aVar3;
                                                    i17 = i14;
                                                    canvas2 = canvas;
                                                    list4 = list3;
                                                } else {
                                                    je9Var2 = je9Var2;
                                                }
                                                canvas.drawRect(0.0f, 0.0f, i16, i15, dygVar2.n);
                                                vd7.q(aygVar.getContext());
                                                str4 = dygVar2.b;
                                                a4cVar3 = gm0.f;
                                                if (a4cVar3 == null) {
                                                    je9Var = je9Var2;
                                                } else {
                                                    je9Var = je9Var2;
                                                    if (a4cVar3.b(je9Var)) {
                                                        a4cVar3.c(je9Var, str4, "StoryImageRenderer: starting drawPhoto", null);
                                                    }
                                                }
                                                e(dygVar2, canvas, bitmap, rectF, i6aVar3, i6, i14, i16, i15);
                                                dyg dygVar6 = dygVar2;
                                                Canvas canvas7 = canvas;
                                                bitmap = bitmap;
                                                i18 = i6;
                                                i19 = i14;
                                                int i212 = i16;
                                                int i213 = i15;
                                                vd7.q(aygVar.getContext());
                                                str5 = dygVar6.b;
                                                a4cVar4 = gm0.f;
                                                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                                                    int size3 = list3.size();
                                                    StringBuilder sb3 = new StringBuilder("StoryImageRenderer: starting storyLayers ");
                                                    sb3.append(size3);
                                                    String str12 = str8;
                                                    sb3.append(str12);
                                                    sb3.append(i18);
                                                    sb3.append(str12);
                                                    sb3.append(i19);
                                                    a4cVar4.c(je9Var, str5, sb3.toString(), null);
                                                }
                                                c(dygVar6, canvas7, list3, i18, i19, i212, i213);
                                                dygVar3 = dygVar6;
                                                vd7.q(aygVar.getContext());
                                                au3 au3VarClone3 = au3Var2.clone();
                                                au3Var2.close();
                                                rel.b(bitmap);
                                                poeVar = au3VarClone3;
                                                i5 = i212;
                                                i21 = i213;
                                                thA = roe.a(poeVar);
                                                if (thA != null) {
                                                    obj = null;
                                                    gm0.V(dygVar3.b, null, new yxg(nbh.u("StoryImageRenderer: render failed (", i5, str7, i21, str), thA));
                                                } else {
                                                    obj = null;
                                                }
                                                return poeVar instanceof poe ? obj : poeVar;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                au3Var = au3Var2;
                                                bitmap2 = bitmap;
                                                au3.E(au3Var);
                                                throw th;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            bitmap2 = bitmap3;
                                            au3Var = au3Var3;
                                            au3.E(au3Var);
                                            throw th;
                                        }
                                    }
                                    if (i23 != 3) {
                                        ore.k("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    i15 = aygVar.o;
                                    i16 = aygVar.n;
                                    i17 = aygVar.m;
                                    int i34 = aygVar.l;
                                    rectF = aygVar.k;
                                    canvas2 = aygVar.j;
                                    au3Var = aygVar.i;
                                    bitmap2 = aygVar.h;
                                    i6aVar4 = aygVar.f;
                                    list4 = aygVar.e;
                                    try {
                                        ch3.d0(obj4);
                                        str7 = "x";
                                        str8 = ", ";
                                        str = ")";
                                        bitmap = bitmap2;
                                        au3Var2 = au3Var;
                                        i6 = i34;
                                        dygVar2 = dygVar3;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        au3.E(au3Var);
                                        throw th;
                                    }
                                    try {
                                        au3.E(au3Var);
                                        throw th;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        bitmap = bitmap2;
                                    }
                                    au3Var2.close();
                                    rel.b(bitmap);
                                    poeVar = au3VarClone3;
                                    i5 = i212;
                                    i21 = i213;
                                    thA = roe.a(poeVar);
                                    if (thA != null) {
                                        obj = null;
                                        gm0.V(dygVar3.b, null, new yxg(nbh.u("StoryImageRenderer: render failed (", i5, str7, i21, str), thA));
                                    } else {
                                        obj = null;
                                    }
                                    if (poeVar instanceof poe) {
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                }
                                c(dygVar6, canvas7, list3, i18, i19, i212, i213);
                                dygVar3 = dygVar6;
                                vd7.q(aygVar.getContext());
                                au3 au3VarClone4 = au3Var2.clone();
                            } catch (Throwable th12) {
                                th = th12;
                                au3Var = au3Var2;
                                bitmap2 = bitmap;
                                au3.E(au3Var);
                                throw th;
                            }
                            vd7.q(aygVar.getContext());
                            str5 = dygVar6.b;
                            a4cVar4 = gm0.f;
                            if (a4cVar4 != null) {
                                int size4 = list3.size();
                                StringBuilder sb4 = new StringBuilder("StoryImageRenderer: starting storyLayers ");
                                sb4.append(size4);
                                String str13 = str8;
                                sb4.append(str13);
                                sb4.append(i18);
                                sb4.append(str13);
                                sb4.append(i19);
                                a4cVar4.c(je9Var, str5, sb4.toString(), null);
                            }
                        } catch (Throwable th13) {
                            th = th13;
                        }
                        e(dygVar2, canvas, bitmap, rectF, i6aVar3, i6, i14, i16, i15);
                        dyg dygVar7 = dygVar2;
                        Canvas canvas8 = canvas;
                        bitmap = bitmap;
                        i18 = i6;
                        i19 = i14;
                        int i214 = i16;
                        int i215 = i15;
                    } catch (Throwable th14) {
                        th = th14;
                        bitmap = bitmap;
                    }
                    canvas.drawRect(0.0f, 0.0f, i16, i15, dygVar2.n);
                    vd7.q(aygVar.getContext());
                    str4 = dygVar2.b;
                    a4cVar3 = gm0.f;
                    if (a4cVar3 == null) {
                        je9Var = je9Var2;
                    } else {
                        je9Var = je9Var2;
                        if (a4cVar3.b(je9Var)) {
                            a4cVar3.c(je9Var, str4, "StoryImageRenderer: starting drawPhoto", null);
                        }
                    }
                } catch (Throwable th15) {
                    th = th15;
                    au3Var = au3Var2;
                    bitmap2 = bitmap;
                    au3.E(au3Var);
                    throw th;
                }
                i6aVar3 = i6aVar4;
                list3 = list4;
                canvas = canvas2;
                i14 = i17;
                rel.b(bitmap);
                throw th;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th16) {
            th = th16;
            i21 = i20;
            i20 = i21;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0205: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r16 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:80:0x0205 */
    /* JADX WARN: Type inference failed for: r19v1, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r24v1, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4, types: [int] */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static final Object g(dyg dygVar, Bitmap bitmap, int i, int i2, List list, int i3, int i4, int i5, int i6, i6a i6aVar, nq4 nq4Var) {
        cyg cygVar;
        int i7;
        Object poeVar;
        ?? r2;
        Object obj;
        au3 au3VarC;
        Canvas canvas;
        int i8;
        int i9;
        int i10;
        List list2;
        int i11;
        i6a i6aVar2;
        Throwable th;
        int i12;
        ?? r24;
        dyg dygVar2 = dygVar;
        int i13 = i5;
        int i14 = i6;
        dygVar2.getClass();
        je9 je9Var = je9.d;
        if (nq4Var instanceof cyg) {
            cygVar = (cyg) nq4Var;
            int i15 = cygVar.p;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cygVar.p = i15 - Integer.MIN_VALUE;
            } else {
                cygVar = new cyg(dygVar2, nq4Var);
            }
        } else {
            cygVar = new cyg(dygVar2, nq4Var);
        }
        Object obj2 = cygVar.n;
        hu4 hu4Var = hu4.a;
        int i16 = cygVar.p;
        try {
            if (i16 == 0) {
                ch3.d0(obj2);
                try {
                    try {
                        String str = dygVar2.b;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "renderVideoOverlayInternal: started", null);
                        }
                        au3VarC = ((k2d) dygVar2.e.getValue()).c(i13 == true ? 1 : 0, i14, Bitmap.Config.ARGB_8888);
                        try {
                            canvas = new Canvas((Bitmap) au3VarC.K());
                            vd7.q(cygVar.getContext());
                            String str2 = dygVar2.b;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str2, "renderVideoOverlayInternal: will draw blur: " + (i13 == true ? 1 : 0) + "x" + i14, null);
                            }
                            cygVar.d = list;
                            cygVar.e = i6aVar;
                            cygVar.f = au3VarC;
                            cygVar.g = canvas;
                            i8 = i;
                            cygVar.h = i8;
                            i9 = i2;
                            cygVar.i = i9;
                            cygVar.j = i3;
                            i10 = i4;
                            cygVar.k = i10;
                            cygVar.l = i13 == true ? 1 : 0;
                            cygVar.m = i14;
                            cygVar.p = 1;
                            b(dygVar2, canvas, bitmap, i13 == true ? 1 : 0, i14);
                            if (sbi.a == hu4Var) {
                                return hu4Var;
                            }
                            list2 = list;
                            i11 = i3;
                            i6aVar2 = i6aVar;
                            i12 = i13;
                        } catch (Throwable th2) {
                            th = th2;
                            au3.E(au3VarC);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        poeVar = new poe(th);
                        r2 = i13;
                    }
                } catch (CancellationException e) {
                    throw e;
                }
            } else {
                if (i16 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i17 = cygVar.m;
                int i18 = cygVar.l;
                int i19 = cygVar.k;
                i11 = cygVar.j;
                i9 = cygVar.i;
                int i20 = cygVar.h;
                canvas = cygVar.g;
                au3VarC = cygVar.f;
                i6aVar2 = cygVar.e;
                List list3 = cygVar.d;
                try {
                    ch3.d0(obj2);
                    i14 = i17;
                    i12 = i18;
                    i10 = i19;
                    i8 = i20;
                    list2 = list3;
                } catch (Throwable th4) {
                    th = th4;
                    au3.E(au3VarC);
                    throw th;
                }
            }
            float f = i12;
            float f2 = i14;
            ?? r25 = dygVar2.n;
            canvas.drawRect(0.0f, 0.0f, f, f2, r25);
            vd7.q(cygVar.getContext());
            RectF rectFA = rsl.a(i8, i9, i12, i14);
            try {
                if (i6aVar2 == null || i11 <= 0 || i10 <= 0) {
                    r24 = i12;
                    canvas.drawRect(rectFA, (Paint) dygVar2.o.getValue());
                } else {
                    float f3 = f / i11;
                    float f4 = f2 / i10;
                    r25 = i12;
                    try {
                        int iSave = canvas.save();
                        try {
                            try {
                                canvas.translate(i6aVar2.a * f3, i6aVar2.b * f4);
                                canvas.rotate(i6aVar2.d);
                                float f5 = i6aVar2.c;
                                canvas.scale(f5, f5);
                                canvas.translate((-i6aVar2.e) * f3, (-i6aVar2.f) * f4);
                                canvas.drawRect(rectFA, (Paint) dygVar2.o.getValue());
                                canvas.restoreToCount(iSave);
                                r24 = r25;
                            } catch (Throwable th5) {
                                th = th5;
                                canvas.restoreToCount(iSave);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        au3.E(au3VarC);
                        throw th;
                    }
                }
                String str3 = dygVar2.b;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str3, "renderVideoOverlayInternal: video rect: " + rectFA, null);
                }
                vd7.q(cygVar.getContext());
                String str4 = dygVar2.b;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                    a4cVar4.c(je9Var, str4, "renderVideoOverlayInternal: drawing layers: " + list2.size(), null);
                }
                List list4 = list2;
                int i21 = i14;
                try {
                    c(dygVar2, canvas, list4, i11, i10, r24, i21);
                    dygVar2 = dygVar2;
                    r2 = r24;
                    try {
                        vd7.q(cygVar.getContext());
                        poeVar = au3VarC.clone();
                        au3VarC.close();
                        i14 = i21;
                    } catch (Throwable th8) {
                        th = th8;
                        au3.E(au3VarC);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
            i14 = i7;
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            obj = null;
            gm0.V(dygVar2.b, null, new yxg(nbh.u("StoryImageRenderer: video overlay render failed (", r2, "x", i14, ")"), thA));
        } else {
            obj = null;
        }
        return poeVar instanceof poe ? obj : poeVar;
    }

    public final void h(Canvas canvas, Bitmap bitmap, int i, int i2) {
        float f = i;
        float f2 = i2;
        float fMax = Math.max(f / bitmap.getWidth(), f2 / bitmap.getHeight());
        float width = bitmap.getWidth() * fMax;
        float height = bitmap.getHeight() * fMax;
        float f3 = (f - width) / 2.0f;
        float f4 = (f2 - height) / 2.0f;
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new RectF(f3, f4, width + f3, height + f4), this.j);
    }

    public final Context i() {
        return (Context) this.c.getValue();
    }
}
