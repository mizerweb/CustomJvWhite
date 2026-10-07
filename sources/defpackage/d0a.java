package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class d0a implements Parcelable {
    public static final Parcelable.Creator<d0a> CREATOR;
    public static final mw d;
    public static final String[] e;
    public final Bundle a;
    public MediaMetadata b;
    public byte[] c;

    static {
        mw mwVar = new mw(0);
        d = mwVar;
        mwVar.put(MediaMetadataCompat.METADATA_KEY_TITLE, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_ARTIST, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_DURATION, 0);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_ALBUM, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_AUTHOR, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_WRITER, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_COMPOSER, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_COMPILATION, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_DATE, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_YEAR, 0);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_GENRE, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, 0);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, 0);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER, 0);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_ART, 2);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_ART_URI, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, 2);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_USER_RATING, 3);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_RATING, 3);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, 2);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, 0);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, 1);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT, 0);
        mwVar.put(MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, 0);
        e = new String[]{MediaMetadataCompat.METADATA_KEY_TITLE, MediaMetadataCompat.METADATA_KEY_ARTIST, MediaMetadataCompat.METADATA_KEY_ALBUM, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_WRITER, MediaMetadataCompat.METADATA_KEY_AUTHOR, MediaMetadataCompat.METADATA_KEY_COMPOSER, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION};
        CREATOR = new v39(20);
    }

    public d0a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        ClassLoader classLoader = v2a.class.getClassLoader();
        classLoader.getClass();
        bundle2.setClassLoader(classLoader);
    }

    public static d0a b(MediaMetadata mediaMetadata) {
        if (mediaMetadata == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        d0a d0aVarCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        d0aVarCreateFromParcel.b = mediaMetadata;
        return d0aVarCreateFromParcel;
    }

    public final boolean a(String str) {
        return this.a.containsKey(str);
    }

    public final Bundle c() {
        return new Bundle(this.a);
    }

    public final long d(String str) {
        return this.a.getLong(str, 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MediaMetadata e() {
        if (this.b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            Bundle bundle = this.a;
            for (String str : bundle.keySet()) {
                Integer num = (Integer) d.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            this.b = builder.build();
        }
        return this.b;
    }

    public final Bitmap f() {
        String[] strArr = {MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_ALBUM_ART, MediaMetadataCompat.METADATA_KEY_ART};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            Bundle bundle = this.a;
            if (bundle.containsKey(str)) {
                try {
                    return (Bitmap) bundle.getParcelable(str);
                } catch (Exception e2) {
                    lvb.H0("MediaMetadata", "Failed to retrieve a key as Bitmap.", e2);
                    return null;
                }
            }
        }
        return null;
    }

    public final byte[] g() {
        Bitmap bitmapF = f();
        if (bitmapF == null) {
            return null;
        }
        if (this.c == null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmapF.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    this.c = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                lvb.H0("MediaMetadata", "Failed to compress MediaMetadataCompat artwork", e2);
            }
        }
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[RETURN] */
    public final Uri h() {
        String strK;
        String[] strArr = {MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, MediaMetadataCompat.METADATA_KEY_ART_URI};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (this.a.containsKey(str)) {
                strK = k(str);
                if (strK != null) {
                    return Uri.parse(strK);
                }
                return null;
            }
        }
        strK = null;
        if (strK != null) {
            return Uri.parse(strK);
        }
        return null;
    }

    public final d5e j(String str) {
        try {
            return d5e.a(this.a.getParcelable(str));
        } catch (Exception e2) {
            lvb.H0("MediaMetadata", "Failed to retrieve a key as Rating.", e2);
            return null;
        }
    }

    public final String k(String str) {
        CharSequence charSequence = this.a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final CharSequence l(String str) {
        return this.a.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public d0a(Parcel parcel) {
        Bundle bundle = parcel.readBundle(v2a.class.getClassLoader());
        bundle.getClass();
        this.a = bundle;
    }
}
