package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class uv9 implements Parcelable {
    public static final Parcelable.Creator<uv9> CREATOR = new v39(19);
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final Bitmap e;
    public byte[] f;
    public final Uri g;
    public final Bundle h;
    public final Uri i;
    public MediaDescription j;

    public uv9(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.g = uri;
        this.h = bundle;
        this.i = uri2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    public static uv9 a(MediaDescription mediaDescription) {
        Uri mediaUri;
        String mediaId = mediaDescription.getMediaId();
        CharSequence title = mediaDescription.getTitle();
        CharSequence subtitle = mediaDescription.getSubtitle();
        CharSequence description = mediaDescription.getDescription();
        Bitmap iconBitmap = mediaDescription.getIconBitmap();
        Uri iconUri = mediaDescription.getIconUri();
        Bundle bundleN = vqi.n(mediaDescription.getExtras());
        if (bundleN != null) {
            bundleN = new Bundle(bundleN);
        }
        Bundle bundle = null;
        if (bundleN != null) {
            mediaUri = (Uri) bundleN.getParcelable(MediaDescriptionCompat.DESCRIPTION_KEY_MEDIA_URI);
            if (mediaUri != null) {
                if (!bundleN.containsKey(MediaDescriptionCompat.DESCRIPTION_KEY_NULL_BUNDLE_FLAG) || bundleN.size() != 2) {
                    bundleN.remove(MediaDescriptionCompat.DESCRIPTION_KEY_MEDIA_URI);
                    bundleN.remove(MediaDescriptionCompat.DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
                }
            }
            if (mediaUri == null) {
                mediaUri = mediaDescription.getMediaUri();
            }
            uv9 uv9Var = new uv9(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
            uv9Var.j = mediaDescription;
            return uv9Var;
        }
        mediaUri = null;
        bundle = bundleN;
        if (mediaUri == null) {
            mediaUri = mediaDescription.getMediaUri();
        }
        uv9 uv9Var2 = new uv9(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
        uv9Var2.j = mediaDescription;
        return uv9Var2;
    }

    public final CharSequence b() {
        return this.d;
    }

    public final Bundle c() {
        return this.h;
    }

    public final byte[] d() {
        Bitmap bitmap = this.e;
        if (bitmap == null) {
            return null;
        }
        if (this.f == null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    this.f = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                lvb.H0("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
            }
        }
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Uri e() {
        return this.g;
    }

    public final MediaDescription f() {
        MediaDescription mediaDescription = this.j;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.a);
        builder.setTitle(this.b);
        builder.setSubtitle(this.c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.g);
        builder.setExtras(this.h);
        builder.setMediaUri(this.i);
        MediaDescription mediaDescriptionBuild = builder.build();
        this.j = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    public final String g() {
        return this.a;
    }

    public final Uri h() {
        return this.i;
    }

    public final CharSequence j() {
        return this.c;
    }

    public final CharSequence k() {
        return this.b;
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        f().writeToParcel(parcel, i);
    }
}
