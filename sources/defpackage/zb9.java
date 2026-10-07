package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zb9 extends ujg {
    public final /* synthetic */ pjd f;
    public final /* synthetic */ es0 g;
    public final /* synthetic */ v78 h;
    public final /* synthetic */ CancellationSignal i;
    public final /* synthetic */ bc9 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb9(bc9 bc9Var, lq0 lq0Var, pjd pjdVar, es0 es0Var, pjd pjdVar2, es0 es0Var2, v78 v78Var, CancellationSignal cancellationSignal) {
        super(lq0Var, pjdVar, es0Var, "LocalThumbnailBitmapSdk29Producer");
        this.j = bc9Var;
        this.f = pjdVar2;
        this.g = es0Var2;
        this.h = v78Var;
        this.i = cancellationSignal;
    }

    @Override // defpackage.ujg
    public final void b(Object obj) {
        au3.E((au3) obj);
    }

    @Override // defpackage.ujg
    public final Map c(Object obj) {
        return h98.a("createdThumbnail", String.valueOf(((au3) obj) != null));
    }

    @Override // defpackage.ujg
    public final Object d() throws IOException {
        String strA;
        Bitmap bitmapLoadThumbnail;
        ContentResolver contentResolver = this.j.c;
        v78 v78Var = this.h;
        bne bneVar = v78Var.h;
        int i = np0.q;
        int i2 = bneVar != null ? bneVar.a : 2048;
        Uri uri = v78Var.b;
        if (bneVar != null) {
            i = bneVar.b;
        }
        Size size = new Size(i2, i);
        try {
            strA = rki.a(contentResolver, uri);
        } catch (IllegalArgumentException unused) {
            strA = null;
        }
        CancellationSignal cancellationSignal = this.i;
        if (strA != null) {
            bitmapLoadThumbnail = y7a.b(y7a.a(strA)) ? ThumbnailUtils.createVideoThumbnail(new File(strA), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(strA), size, cancellationSignal);
        } else {
            bitmapLoadThumbnail = null;
        }
        if (bitmapLoadThumbnail == null) {
            bitmapLoadThumbnail = contentResolver.loadThumbnail(uri, size, cancellationSignal);
        }
        if (bitmapLoadThumbnail == null) {
            return null;
        }
        CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(bitmapLoadThumbnail, yr8.o(), s98.d, 0);
        es0 es0Var = this.g;
        es0Var.putExtra(HasExtraData.KEY_IMAGE_FORMAT, "thumbnail");
        closeableStaticBitmapOf.putExtras(es0Var.f);
        return au3.Y(closeableStaticBitmapOf);
    }

    @Override // defpackage.ujg
    public final void e() {
        super.e();
        this.i.cancel();
    }

    @Override // defpackage.ujg
    public final void f(Exception exc) {
        super.f(exc);
        pjd pjdVar = this.f;
        es0 es0Var = this.g;
        pjdVar.e(es0Var, "LocalThumbnailBitmapSdk29Producer", false);
        es0Var.h("local", "thumbnail_bitmap");
    }

    @Override // defpackage.ujg
    public final void g(Object obj) {
        au3 au3Var = (au3) obj;
        super.g(au3Var);
        boolean z = au3Var != null;
        pjd pjdVar = this.f;
        es0 es0Var = this.g;
        pjdVar.e(es0Var, "LocalThumbnailBitmapSdk29Producer", z);
        es0Var.h("local", "thumbnail_bitmap");
    }
}
