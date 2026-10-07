package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.os.ParcelFileDescriptor;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes2.dex */
public final class cc9 extends ujg {
    public final /* synthetic */ pjd f;
    public final /* synthetic */ es0 g;
    public final /* synthetic */ v78 h;
    public final /* synthetic */ bc9 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc9(bc9 bc9Var, lq0 lq0Var, pjd pjdVar, es0 es0Var, pjd pjdVar2, es0 es0Var2, v78 v78Var) {
        super(lq0Var, pjdVar, es0Var, "VideoThumbnailProducer");
        this.i = bc9Var;
        this.f = pjdVar2;
        this.g = es0Var2;
        this.h = v78Var;
    }

    @Override // defpackage.ujg
    public final void b(Object obj) {
        au3.E((au3) obj);
    }

    @Override // defpackage.ujg
    public final Map c(Object obj) {
        return h98.a("createdThumbnail", String.valueOf(((au3) obj) != null));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    @Override // defpackage.ujg
    public final Object d() throws Throwable {
        String strA;
        Bitmap bitmapCreateVideoThumbnail;
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap frameAtTime;
        int i;
        ContentResolver contentResolver = this.i.c;
        v78 v78Var = this.h;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            strA = rki.a(contentResolver, v78Var.b);
        } catch (IllegalArgumentException unused) {
            strA = null;
        }
        if (strA != null) {
            bne bneVar = v78Var.h;
            int i2 = np0.q;
            if ((bneVar != null ? bneVar.a : 2048) > 96) {
                i = 1;
            } else {
                if (bneVar != null) {
                    i2 = bneVar.b;
                }
                if (i2 > 96) {
                    i = 1;
                } else {
                    i = 3;
                }
            }
            bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(strA, i);
        } else {
            bitmapCreateVideoThumbnail = null;
        }
        if (bitmapCreateVideoThumbnail == null) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(v78Var.b, "r");
                parcelFileDescriptorOpenFileDescriptor.getClass();
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException unused2) {
                    }
                } catch (FileNotFoundException unused3) {
                    if (mediaMetadataRetriever != null) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (IOException unused4) {
                        }
                    }
                    frameAtTime = null;
                } catch (Throwable th) {
                    th = th;
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    if (mediaMetadataRetriever2 != null) {
                        try {
                            mediaMetadataRetriever2.release();
                        } catch (IOException unused5) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused6) {
                mediaMetadataRetriever = null;
            } catch (Throwable th2) {
                th = th2;
            }
            bitmapCreateVideoThumbnail = frameAtTime;
        }
        if (bitmapCreateVideoThumbnail == null) {
            return null;
        }
        CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(bitmapCreateVideoThumbnail, yr8.o(), s98.d, 0);
        es0 es0Var = this.g;
        es0Var.putExtra(HasExtraData.KEY_IMAGE_FORMAT, "thumbnail");
        closeableStaticBitmapOf.putExtras(es0Var.f);
        return au3.Y(closeableStaticBitmapOf);
    }

    @Override // defpackage.ujg
    public final void f(Exception exc) {
        super.f(exc);
        pjd pjdVar = this.f;
        es0 es0Var = this.g;
        pjdVar.e(es0Var, "VideoThumbnailProducer", false);
        es0Var.h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
    }

    @Override // defpackage.ujg
    public final void g(Object obj) {
        au3 au3Var = (au3) obj;
        super.g(au3Var);
        boolean z = au3Var != null;
        pjd pjdVar = this.f;
        es0 es0Var = this.g;
        pjdVar.e(es0Var, "VideoThumbnailProducer", z);
        es0Var.h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
    }
}
