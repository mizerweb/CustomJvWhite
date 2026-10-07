package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class mz8 {
    public static final u98 a;

    static {
        String[] strArr = {MediaMetadataCompat.METADATA_KEY_COMPOSER, MediaMetadataCompat.METADATA_KEY_COMPILATION, MediaMetadataCompat.METADATA_KEY_DATE, MediaMetadataCompat.METADATA_KEY_YEAR, MediaMetadataCompat.METADATA_KEY_GENRE, MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, MediaMetadataCompat.METADATA_KEY_DISC_NUMBER, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_ART, MediaMetadataCompat.METADATA_KEY_ART_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, MediaMetadataCompat.METADATA_KEY_USER_RATING, MediaMetadataCompat.METADATA_KEY_RATING, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_MEDIA_ID, MediaMetadataCompat.METADATA_KEY_MEDIA_URI, MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT, MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"};
        int i = u98.c;
        Object[] objArr = new Object[32];
        objArr[0] = MediaMetadataCompat.METADATA_KEY_TITLE;
        objArr[1] = MediaMetadataCompat.METADATA_KEY_ARTIST;
        objArr[2] = MediaMetadataCompat.METADATA_KEY_DURATION;
        objArr[3] = MediaMetadataCompat.METADATA_KEY_ALBUM;
        objArr[4] = MediaMetadataCompat.METADATA_KEY_AUTHOR;
        objArr[5] = MediaMetadataCompat.METADATA_KEY_WRITER;
        System.arraycopy(strArr, 0, objArr, 6, 26);
        a = u98.l(objArr, 32);
    }

    public static long a(x2d x2dVar, d0a d0aVar, long j) {
        long j2 = x2dVar == null ? 0L : x2dVar.c;
        long jB = b(x2dVar, d0aVar, j);
        long jC = c(d0aVar);
        return jC == -9223372036854775807L ? Math.max(jB, j2) : vqi.k(j2, jB, jC);
    }

    public static long b(x2d x2dVar, d0a d0aVar, long j) {
        if (x2dVar == null) {
            return 0L;
        }
        long jMax = x2dVar.b;
        if (x2dVar.a == 3) {
            Long lValueOf = j == -9223372036854775807L ? null : Long.valueOf(j);
            jMax = Math.max(0L, jMax + ((long) (x2dVar.d * (lValueOf != null ? lValueOf.longValue() : SystemClock.elapsedRealtime() - x2dVar.h))));
        }
        long j2 = jMax;
        long jC = c(d0aVar);
        return jC == -9223372036854775807L ? Math.max(0L, j2) : vqi.k(j2, 0L, jC);
    }

    public static long c(d0a d0aVar) {
        if (d0aVar == null || !d0aVar.a(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            return -9223372036854775807L;
        }
        long jD = d0aVar.d(MediaMetadataCompat.METADATA_KEY_DURATION);
        if (jD <= 0) {
            return -9223372036854775807L;
        }
        return jD;
    }

    public static long d(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                ore.p(zo5.h(i, "Unrecognized FolderType: "));
                return 0L;
        }
    }

    public static int e(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static uv9 f(ry9 ry9Var, Bitmap bitmap) {
        int i;
        CharSequence charSequence;
        uii uiiVar = new uii();
        uiiVar.p(ry9Var.a.equals("") ? null : ry9Var.a);
        b0a b0aVar = ry9Var.d;
        if (bitmap != null) {
            uiiVar.n(bitmap);
        }
        Bundle bundle = b0aVar.I;
        CharSequence charSequence2 = b0aVar.a;
        CharSequence charSequence3 = b0aVar.g;
        CharSequence charSequence4 = b0aVar.f;
        c98 c98Var = b0aVar.J;
        Integer num = b0aVar.H;
        Integer num2 = b0aVar.p;
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        boolean z = (num2 == null || num2.intValue() == -1) ? false : true;
        boolean z2 = num != null;
        if (z || z2) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (z) {
                num2.getClass();
                i = 0;
                bundle.putLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE, d(num2.intValue()));
            } else {
                i = 0;
            }
            if (z2) {
                num.getClass();
                bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
            }
        } else {
            i = 0;
        }
        if (!c98Var.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(c98Var));
        }
        CharSequence charSequence5 = b0aVar.e;
        if (charSequence5 != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence2);
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i2 = i;
            int i3 = i2;
            while (true) {
                int i4 = 2;
                if (i2 < 3) {
                    String[] strArr = d0a.e;
                    if (i3 < strArr.length) {
                        int i5 = i3 + 1;
                        String str = strArr[i3];
                        str.getClass();
                        switch (str.hashCode()) {
                            case -1853648227:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_ARTIST)) {
                                    i4 = -1;
                                } else {
                                    i4 = i;
                                }
                                break;
                            case -1850878751:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_AUTHOR)) {
                                    i4 = -1;
                                } else {
                                    i4 = 1;
                                }
                                break;
                            case -1224124471:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_WRITER)) {
                                    i4 = -1;
                                }
                                break;
                            case 194702059:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE)) {
                                    i4 = -1;
                                } else {
                                    i4 = 3;
                                }
                                break;
                            case 1058837545:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION)) {
                                    i4 = -1;
                                } else {
                                    i4 = 4;
                                }
                                break;
                            case 1684534006:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_COMPOSER)) {
                                    i4 = -1;
                                } else {
                                    i4 = 5;
                                }
                                break;
                            case 1879671865:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_ALBUM)) {
                                    i4 = -1;
                                } else {
                                    i4 = 6;
                                }
                                break;
                            case 1897146402:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_TITLE)) {
                                    i4 = -1;
                                } else {
                                    i4 = 7;
                                }
                                break;
                            case 1965214221:
                                if (!str.equals(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST)) {
                                    i4 = -1;
                                } else {
                                    i4 = 8;
                                }
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                        switch (i4) {
                            case 0:
                                charSequence = b0aVar.b;
                                break;
                            case 1:
                            default:
                                charSequence = null;
                                break;
                            case 2:
                                charSequence = b0aVar.z;
                                break;
                            case 3:
                                charSequence = charSequence4;
                                break;
                            case 4:
                                charSequence = charSequence3;
                                break;
                            case 5:
                                charSequence = b0aVar.A;
                                break;
                            case 6:
                                charSequence = b0aVar.c;
                                break;
                            case 7:
                                charSequence = charSequence2;
                                break;
                            case 8:
                                charSequence = b0aVar.d;
                                break;
                        }
                        if (!TextUtils.isEmpty(charSequence)) {
                            charSequenceArr[i2] = charSequence;
                            i2++;
                        }
                        i3 = i5;
                    }
                }
            }
            charSequence5 = charSequenceArr[i];
            charSequence4 = charSequenceArr[1];
            charSequence3 = charSequenceArr[2];
        }
        uiiVar.s(charSequence5);
        uiiVar.r(charSequence4);
        uiiVar.l(charSequence3);
        uiiVar.o(b0aVar.m);
        uiiVar.q(ry9Var.f.a);
        uiiVar.m(bundle);
        return uiiVar.f();
    }

    public static ry9 g(uv9 uv9Var) {
        uv9Var.getClass();
        String strG = uv9Var.g();
        by9 by9Var = new by9();
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        List list = Collections.EMPTY_LIST;
        hy9 hy9Var = new hy9();
        ly9 ly9Var = ly9.d;
        if (strG == null) {
            strG = "";
        }
        String str = strG;
        u50 u50Var = new u50();
        u50Var.a = uv9Var.h();
        ly9 ly9Var2 = new ly9(u50Var);
        b0a b0aVarI = i(uv9Var, 0);
        dy9 dy9Var = new dy9(by9Var);
        iy9 iy9Var = new iy9(hy9Var);
        if (b0aVarI == null) {
            b0aVarI = b0a.K;
        }
        return new ry9(str, dy9Var, null, iy9Var, b0aVarI, ly9Var2);
    }

    public static ry9 h(String str, d0a d0aVar, int i) {
        ly9 ly9Var;
        by9 by9Var = new by9();
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        List list = Collections.EMPTY_LIST;
        ghe gheVar2 = ghe.e;
        hy9 hy9Var = new hy9();
        ly9 ly9Var2 = ly9.d;
        if (str == null) {
            str = null;
        }
        String strK = d0aVar.k(MediaMetadataCompat.METADATA_KEY_MEDIA_URI);
        if (strK != null) {
            u50 u50Var = new u50();
            u50Var.a = Uri.parse(strK);
            ly9Var = new ly9(u50Var);
        } else {
            ly9Var = ly9Var2;
        }
        b0a b0aVarJ = j(d0aVar, i);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        dy9 dy9Var = new dy9(by9Var);
        iy9 iy9Var = new iy9(hy9Var);
        if (b0aVarJ == null) {
            b0aVarJ = b0a.K;
        }
        return new ry9(str2, dy9Var, null, iy9Var, b0aVarJ, ly9Var);
    }

    public static b0a i(uv9 uv9Var, int i) {
        if (uv9Var == null) {
            return b0a.K;
        }
        zz9 zz9Var = new zz9();
        zz9Var.f = uv9Var.j();
        zz9Var.g = uv9Var.b();
        zz9Var.m = uv9Var.e();
        zz9Var.i = n(d5e.m(i));
        byte[] bArrD = uv9Var.d();
        if (bArrD != null) {
            zz9Var.b(bArrD, 3);
        }
        Bundle bundleC = uv9Var.c();
        Bundle bundle = bundleC == null ? null : new Bundle(bundleC);
        if (bundle != null && bundle.containsKey(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)) {
            zz9Var.p = Integer.valueOf(e(bundle.getLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)));
            bundle.remove(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE);
        }
        zz9Var.q = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            zz9Var.G = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            zz9Var.I = c98.n(c98.n(stringArrayList));
        }
        if (bundle == null || !bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            zz9Var.a = uv9Var.k();
        } else {
            zz9Var.a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            zz9Var.e = uv9Var.k();
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle != null && !bundle.isEmpty()) {
            zz9Var.H = bundle;
        }
        zz9Var.r = Boolean.TRUE;
        return new b0a(zz9Var);
    }

    public static b0a j(d0a d0aVar, int i) {
        CharSequence charSequenceL;
        CharSequence charSequenceL2;
        if (d0aVar == null) {
            return b0a.K;
        }
        zz9 zz9Var = new zz9();
        CharSequence charSequenceL3 = d0aVar.l(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        if (charSequenceL3 != null) {
            charSequenceL2 = d0aVar.l(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE);
            charSequenceL = d0aVar.l(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i2 = 0;
            int i3 = 0;
            while (i2 < 3) {
                String[] strArr = d0a.e;
                if (i3 >= strArr.length) {
                    break;
                }
                int i4 = i3 + 1;
                CharSequence charSequenceL4 = d0aVar.l(strArr[i3]);
                if (!TextUtils.isEmpty(charSequenceL4)) {
                    charSequenceArr[i2] = charSequenceL4;
                    i2++;
                }
                i3 = i4;
            }
            CharSequence charSequence = charSequenceArr[0];
            CharSequence charSequence2 = charSequenceArr[1];
            charSequenceL = charSequenceArr[2];
            charSequenceL3 = charSequence;
            charSequenceL2 = charSequence2;
        }
        CharSequence charSequenceL5 = d0aVar.l(MediaMetadataCompat.METADATA_KEY_TITLE);
        if (charSequenceL5 == null) {
            charSequenceL5 = charSequenceL3;
        }
        zz9Var.a = charSequenceL5;
        zz9Var.e = charSequenceL3;
        zz9Var.f = charSequenceL2;
        zz9Var.g = charSequenceL;
        zz9Var.b = d0aVar.l(MediaMetadataCompat.METADATA_KEY_ARTIST);
        zz9Var.c = d0aVar.l(MediaMetadataCompat.METADATA_KEY_ALBUM);
        zz9Var.d = d0aVar.l(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST);
        zz9Var.j = n(d0aVar.j(MediaMetadataCompat.METADATA_KEY_RATING));
        if (d0aVar.a(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            long jD = d0aVar.d(MediaMetadataCompat.METADATA_KEY_DURATION);
            if (jD >= 0) {
                zz9Var.c(Long.valueOf(jD));
            }
        }
        z4e z4eVarN = n(d0aVar.j(MediaMetadataCompat.METADATA_KEY_USER_RATING));
        if (z4eVarN != null) {
            zz9Var.i = z4eVarN;
        } else {
            zz9Var.i = n(d5e.m(i));
        }
        if (d0aVar.a(MediaMetadataCompat.METADATA_KEY_YEAR)) {
            zz9Var.s = Integer.valueOf((int) d0aVar.d(MediaMetadataCompat.METADATA_KEY_YEAR));
        }
        Uri uriH = d0aVar.h();
        if (uriH != null) {
            zz9Var.m = uriH;
        }
        byte[] bArrG = d0aVar.g();
        if (bArrG != null) {
            zz9Var.b(bArrG, 3);
        }
        boolean zA = d0aVar.a(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        zz9Var.q = Boolean.valueOf(zA);
        if (zA) {
            zz9Var.p = Integer.valueOf(e(d0aVar.d(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE)));
        }
        if (d0aVar.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            zz9Var.G = Integer.valueOf((int) d0aVar.d("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        zz9Var.r = Boolean.TRUE;
        Bundle bundleC = d0aVar.c();
        pci it = a.iterator();
        while (it.hasNext()) {
            bundleC.remove((String) it.next());
        }
        if (!bundleC.isEmpty()) {
            zz9Var.H = bundleC;
        }
        return new b0a(zz9Var);
    }

    public static d0a k(b0a b0aVar, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        vn7 vn7Var = new vn7(21);
        vn7Var.w(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, str);
        CharSequence charSequence = b0aVar.a;
        Bundle bundle = b0aVar.I;
        Integer num = b0aVar.p;
        Uri uri2 = b0aVar.m;
        if (charSequence != null) {
            vn7Var.y(MediaMetadataCompat.METADATA_KEY_TITLE, charSequence);
        }
        CharSequence charSequence2 = b0aVar.e;
        if (charSequence2 != null) {
            vn7Var.y(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, charSequence2);
        }
        CharSequence charSequence3 = b0aVar.f;
        if (charSequence3 != null) {
            vn7Var.y(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, charSequence3);
        }
        CharSequence charSequence4 = b0aVar.g;
        if (charSequence4 != null) {
            vn7Var.y(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, charSequence4);
        }
        CharSequence charSequence5 = b0aVar.b;
        if (charSequence5 != null) {
            vn7Var.y(MediaMetadataCompat.METADATA_KEY_ARTIST, charSequence5);
        }
        CharSequence charSequence6 = b0aVar.c;
        if (charSequence6 != null) {
            vn7Var.y(MediaMetadataCompat.METADATA_KEY_ALBUM, charSequence6);
        }
        CharSequence charSequence7 = b0aVar.d;
        if (charSequence7 != null) {
            vn7Var.y(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, charSequence7);
        }
        Integer num2 = b0aVar.t;
        if (num2 != null) {
            vn7Var.r(num2.intValue(), MediaMetadataCompat.METADATA_KEY_YEAR);
        }
        CharSequence charSequence8 = b0aVar.z;
        if (charSequence8 != null) {
            vn7Var.y(MediaMetadataCompat.METADATA_KEY_WRITER, charSequence8);
        }
        CharSequence charSequence9 = b0aVar.A;
        if (charSequence9 != null) {
            vn7Var.y(MediaMetadataCompat.METADATA_KEY_COMPOSER, charSequence9);
        }
        if (uri != null) {
            vn7Var.w(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, uri.toString());
        }
        if (uri2 != null) {
            vn7Var.w(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, uri2.toString());
            vn7Var.w(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, uri2.toString());
            vn7Var.w(MediaMetadataCompat.METADATA_KEY_ART_URI, uri2.toString());
        }
        if (bitmap != null) {
            vn7Var.q(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap);
            vn7Var.q(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        }
        if (num != null && num.intValue() != -1) {
            vn7Var.r(d(num.intValue()), MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        }
        if (j == -9223372036854775807L && (l = b0aVar.h) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        vn7Var.r(j, MediaMetadataCompat.METADATA_KEY_DURATION);
        d5e d5eVarO = o(b0aVar.i);
        if (d5eVarO != null) {
            vn7Var.u(MediaMetadataCompat.METADATA_KEY_USER_RATING, d5eVarO);
        }
        d5e d5eVarO2 = o(b0aVar.j);
        if (d5eVarO2 != null) {
            vn7Var.u(MediaMetadataCompat.METADATA_KEY_RATING, d5eVarO2);
        }
        Integer num3 = b0aVar.H;
        if (num3 != null) {
            vn7Var.r(num3.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    vn7Var.y(str2, (CharSequence) obj);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    vn7Var.r(((Number) obj).longValue(), str2);
                }
            }
        }
        return vn7Var.l();
    }

    public static PlaybackException l(x2d x2dVar, Context context) {
        if (x2dVar != null) {
            int i = x2dVar.f;
            if (x2dVar.a == 7) {
                CharSequence charSequenceU = x2dVar.g;
                if (charSequenceU == null) {
                    charSequenceU = u(context, q(i));
                }
                Bundle bundle = x2dVar.k;
                String string = charSequenceU != null ? charSequenceU.toString() : null;
                int iQ = q(i);
                if (iQ == -5) {
                    iQ = 2000;
                } else if (iQ == -1) {
                    iQ = 1000;
                }
                int i2 = iQ;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                return new PlaybackException(string, null, i2, bundle, SystemClock.elapsedRealtime());
            }
        }
        return null;
    }

    public static int m(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                lvb.G0("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    public static z4e n(d5e d5eVar) {
        if (d5eVar == null) {
            return null;
        }
        switch (d5eVar.c()) {
            case 1:
                return d5eVar.f() ? new ru7(d5eVar.e()) : new ru7();
            case 2:
                return d5eVar.f() ? new orh(d5eVar.g()) : new orh();
            case 3:
                return d5eVar.f() ? new wgg(3, d5eVar.d()) : new wgg(3);
            case 4:
                return d5eVar.f() ? new wgg(4, d5eVar.d()) : new wgg(4);
            case 5:
                return d5eVar.f() ? new wgg(5, d5eVar.d()) : new wgg(5);
            case 6:
                return d5eVar.f() ? new iqc(d5eVar.b()) : new iqc();
            default:
                return null;
        }
    }

    public static d5e o(z4e z4eVar) {
        if (z4eVar == null) {
            return null;
        }
        int iT = t(z4eVar);
        if (!z4eVar.b()) {
            return d5e.m(iT);
        }
        switch (iT) {
            case 1:
                return d5e.h(((ru7) z4eVar).d());
            case 2:
                return d5e.l(((orh) z4eVar).d());
            case 3:
            case 4:
            case 5:
                return d5e.k(iT, ((wgg) z4eVar).e());
            case 6:
                return d5e.j(((iqc) z4eVar).d());
            default:
                return null;
        }
    }

    public static int p(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                lvb.G0("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    public static int q(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean r(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        ore.p(zo5.h(i, "Unrecognized ShuffleMode: "));
        return false;
    }

    public static void s(e89 e89Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                try {
                    e89Var.get(j, TimeUnit.MILLISECONDS);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } catch (InterruptedException unused) {
                    z = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
                        throw new TimeoutException();
                    }
                    j = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS - jElapsedRealtime2;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    public static int t(z4e z4eVar) {
        if (z4eVar instanceof ru7) {
            return 1;
        }
        if (z4eVar instanceof orh) {
            return 2;
        }
        if (!(z4eVar instanceof wgg)) {
            return z4eVar instanceof iqc ? 6 : 0;
        }
        int iD = ((wgg) z4eVar).d();
        int i = 3;
        if (iD != 3) {
            i = 4;
            if (iD != 4) {
                i = 5;
                if (iD != 5) {
                    return 0;
                }
            }
        }
        return i;
    }

    public static String u(Context context, int i) {
        if (i == -100) {
            return context.getString(R.string.error_message_disconnected);
        }
        if (i == 1) {
            return context.getString(R.string.error_message_info_cancelled);
        }
        if (i == -6) {
            return context.getString(R.string.error_message_not_supported);
        }
        if (i == -5) {
            return context.getString(R.string.error_message_io);
        }
        if (i == -4) {
            return context.getString(R.string.error_message_permission_denied);
        }
        if (i == -3) {
            return context.getString(R.string.error_message_bad_value);
        }
        if (i == -2) {
            return context.getString(R.string.error_message_invalid_state);
        }
        switch (i) {
            case -110:
                return context.getString(R.string.error_message_content_already_playing);
            case -109:
                return context.getString(R.string.error_message_end_of_playlist);
            case -108:
                return context.getString(R.string.error_message_setup_required);
            case -107:
                return context.getString(R.string.error_message_skip_limit_reached);
            case -106:
                return context.getString(R.string.error_message_not_available_in_region);
            case -105:
                return context.getString(R.string.error_message_parental_control_restricted);
            case -104:
                return context.getString(R.string.error_message_concurrent_stream_limit);
            case -103:
                return context.getString(R.string.error_message_premium_account_required);
            case -102:
                return context.getString(R.string.error_message_authentication_expired);
            default:
                return context.getString(R.string.error_message_fallback);
        }
    }

    public static boolean v(long j, long j2) {
        return (j & j2) != 0;
    }
}
