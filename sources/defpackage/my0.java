package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class my0 implements w3f {
    public final Bitmap a;
    public final String b;
    public final int c;
    public final sya d;
    public final int e;
    public final int f;
    public final int g;
    public final Uri h;

    public my0(Bitmap bitmap, String str, int i) {
        this.a = bitmap;
        this.b = str;
        this.c = i;
        this.d = sya.IMAGE_JPEG;
        this.e = bitmap.getByteCount();
        this.f = bitmap.getWidth();
        this.g = bitmap.getHeight();
        this.h = MediaStore.Images.Media.getContentUri("external_primary");
    }

    @Override // defpackage.w3f
    public final sya a() {
        return this.d;
    }

    @Override // defpackage.w3f
    public final void b(ContentResolver contentResolver, Uri uri) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri, "w");
        if (outputStreamOpenOutputStream != null) {
            try {
                this.a.compress(Bitmap.CompressFormat.JPEG, this.c, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(outputStreamOpenOutputStream, th);
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.w3f
    public final Uri f() {
        return this.h;
    }

    @Override // defpackage.w3f
    public final Integer getHeight() {
        return Integer.valueOf(this.g);
    }

    @Override // defpackage.w3f
    public final Integer getWidth() {
        return Integer.valueOf(this.f);
    }

    @Override // defpackage.w3f
    public final String i() {
        return this.b;
    }

    @Override // defpackage.w3f
    public final Integer j() {
        return Integer.valueOf(this.e);
    }

    @Override // defpackage.w3f
    public final void l(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsoluteFile());
        try {
            this.a.compress(Bitmap.CompressFormat.JPEG, this.c, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public /* synthetic */ my0(Bitmap bitmap) {
        this(bitmap, Environment.DIRECTORY_PICTURES, 100);
    }
}
