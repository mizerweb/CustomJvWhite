package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ta9 extends ujg {
    public final /* synthetic */ v78 f;
    public final /* synthetic */ ua9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta9(ua9 ua9Var, lq0 lq0Var, pjd pjdVar, es0 es0Var, v78 v78Var) {
        super(lq0Var, pjdVar, es0Var, "LocalExifThumbnailProducer");
        this.g = ua9Var;
        this.f = v78Var;
    }

    @Override // defpackage.ujg
    public final void b(Object obj) {
        p76.g((p76) obj);
    }

    @Override // defpackage.ujg
    public final Map c(Object obj) {
        return h98.a("createdThumbnail", Boolean.toString(((p76) obj) != null));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f  */
    @Override // defpackage.ujg
    public final Object d() {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        ExifInterface exifInterface;
        Uri uri = this.f.b;
        ua9 ua9Var = this.g;
        ContentResolver contentResolver = ua9Var.c;
        String strA = rki.a(contentResolver, uri);
        p76 p76Var = null;
        pair = null;
        Pair pair = null;
        p76Var = null;
        if (strA == null) {
            exifInterface = null;
        } else {
            try {
                File file = new File(strA);
                if (file.exists() && file.canRead()) {
                    exifInterface = new ExifInterface(strA);
                } else {
                    if ("content".equals(rki.b(uri))) {
                        try {
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                        } catch (FileNotFoundException unused) {
                            assetFileDescriptorOpenAssetFileDescriptor = null;
                        }
                    } else {
                        assetFileDescriptorOpenAssetFileDescriptor = null;
                    }
                    if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                        ExifInterface exifInterface2 = new ExifInterface(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                        exifInterface = exifInterface2;
                    } else {
                        exifInterface = null;
                    }
                }
            } catch (IOException unused2) {
            } catch (StackOverflowError unused3) {
                pj6.b("StackOverflowError in ExifInterface constructor", ua9.class);
            }
        }
        if (exifInterface != null && exifInterface.hasThumbnail()) {
            byte[] thumbnail = exifInterface.getThumbnail();
            thumbnail.getClass();
            qg7 qg7Var = ua9Var.b;
            qg7Var.getClass();
            dba dbaVar = new dba((waa) qg7Var.b, thumbnail.length);
            try {
                try {
                    dbaVar.write(thumbnail, 0, thumbnail.length);
                    cba cbaVarY = dbaVar.y();
                    dbaVar.close();
                    fbd fbdVar = new fbd(cbaVarY);
                    ifh ifhVar = oy0.a;
                    ByteBuffer byteBufferAllocate = (ByteBuffer) ((sbd) ifhVar.getValue()).a();
                    if (byteBufferAllocate == null) {
                        int i = k55.a;
                        byteBufferAllocate = ByteBuffer.allocate(16384);
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    try {
                        options.inTempStorage = byteBufferAllocate.array();
                        BitmapFactory.decodeStream(fbdVar, null, options);
                        if (options.outWidth != -1 && options.outHeight != -1) {
                            pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                        }
                        ((sbd) ifhVar.getValue()).d(byteBufferAllocate);
                        String attribute = exifInterface.getAttribute("Orientation");
                        attribute.getClass();
                        int iC = h21.c(Integer.parseInt(attribute));
                        int iIntValue = pair != null ? ((Integer) pair.first).intValue() : -1;
                        int iIntValue2 = pair != null ? ((Integer) pair.second).intValue() : -1;
                        g95 g95VarY = au3.Y(cbaVarY);
                        try {
                            p76Var = new p76(g95VarY);
                            g95VarY.close();
                            p76Var.b = kb5.a;
                            p76Var.c = iC;
                            p76Var.e = iIntValue;
                            p76Var.f = iIntValue2;
                        } catch (Throwable th) {
                            au3.E(g95VarY);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ((sbd) oy0.a.getValue()).d(byteBufferAllocate);
                        throw th2;
                    }
                } catch (IOException e) {
                    ayl.b(e);
                    throw null;
                }
            } catch (Throwable th3) {
                dbaVar.close();
                throw th3;
            }
        }
        return p76Var;
    }
}
