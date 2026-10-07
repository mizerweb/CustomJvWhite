package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.Spannable;
import android.text.util.Linkify;
import android.webkit.WebView;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mmc {
    public static final ps0 a = new ps0(17);

    /* JADX WARN: Code duplicated, block: B:104:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x010c  */
    public static String a(String str) {
        int i;
        int iEnd;
        MatchResult matchResult;
        MatchResult matchResult2;
        int i2;
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        Pattern pattern = yu6.c;
        Matcher matcher = pattern.matcher(str);
        int i3 = 0;
        int iEnd2 = 0;
        while (matcher.find(iEnd2)) {
            if (yu6.a(matcher.group(i3))) {
                int iStart = matcher.start();
                int iEnd3 = matcher.end();
                Pattern pattern2 = yu6.b;
                Matcher matcher2 = pattern2.matcher(str);
                String strGroup = "";
                int i4 = i3;
                int i5 = -1;
                int iEnd4 = -1;
                int i6 = 1;
                int i7 = 1;
                boolean z = true;
                while (true) {
                    if (iEnd3 < str.length()) {
                        if (matcher2.find(iEnd3)) {
                            if (matcher2.end() - matcher2.start() > 25) {
                                iEnd = -matcher2.end();
                            } else {
                                while (iEnd3 < matcher2.start()) {
                                    int i8 = iEnd3 + 1;
                                    if ("\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(iEnd3)) != -1) {
                                        i6++;
                                    }
                                    iEnd3 = i8;
                                }
                                if (i6 <= 5 && (i7 = i7 + 1) <= 14) {
                                    if (iEnd3 <= 0 || ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(iEnd3 - 1)) != -1) {
                                        Matcher matcherRegion = pattern.matcher(str).region(iEnd3, str.length());
                                        if (matcherRegion.lookingAt()) {
                                            matchResult = matcherRegion.toMatchResult();
                                            if (!yu6.a(matchResult.group(0))) {
                                                matchResult = null;
                                            }
                                        } else {
                                            matchResult = null;
                                        }
                                    } else {
                                        matchResult = null;
                                    }
                                    if (matchResult == null) {
                                        if (yu6.e.matcher(matcher2.group(0)).matches()) {
                                            i4 = 1;
                                        } else if (i7 == 5 && i4 == 0) {
                                            iEnd3 = matcher2.end();
                                        } else if (i4 != 0 && i7 > 4) {
                                            if (iEnd3 <= 0 || ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(iEnd3 - 1)) != -1) {
                                                Matcher matcherRegion2 = yu6.d.matcher(str).region(iEnd3, str.length());
                                                if (matcherRegion2.lookingAt()) {
                                                    matchResult2 = matcherRegion2.toMatchResult();
                                                } else {
                                                    matchResult2 = null;
                                                }
                                            } else {
                                                matchResult2 = null;
                                            }
                                            if (matchResult2 != null) {
                                                if (strGroup.equals("et") && matchResult2.group(0).equals("al")) {
                                                    iEnd3 = matchResult2.end();
                                                } else {
                                                    Matcher matcher3 = pattern2.matcher(str);
                                                    if (matcher3.find(matchResult2.end())) {
                                                        String strGroup2 = matcher3.group(0);
                                                        int iGroupCount = matchResult2.groupCount();
                                                        while (iGroupCount > 0) {
                                                            int i9 = iGroupCount - 1;
                                                            if (matchResult2.group(iGroupCount) != null) {
                                                                iGroupCount = i9;
                                                                break;
                                                            }
                                                            iGroupCount = i9;
                                                        }
                                                        if (yu6.g.matcher(strGroup2).matches()) {
                                                            xu6 xu6Var = yu6.a[iGroupCount];
                                                            xu6Var.getClass();
                                                            int i10 = Integer.parseInt(strGroup2.substring(0, 2));
                                                            if ((xu6Var.a <= i10 && i10 <= xu6Var.b) || i10 == xu6Var.c || i10 == xu6Var.d) {
                                                                iEnd = matcher3.end();
                                                            }
                                                        }
                                                    } else {
                                                        iEnd4 = matchResult2.end();
                                                    }
                                                }
                                            }
                                        }
                                        i2 = 0;
                                        z = false;
                                        strGroup = matcher2.group(i2);
                                        iEnd3 = matcher2.end();
                                        i3 = i2;
                                    } else if (!z || i6 <= 1) {
                                        if (i5 == -1) {
                                            i5 = iEnd3;
                                        }
                                        i2 = 0;
                                        strGroup = matcher2.group(i2);
                                        iEnd3 = matcher2.end();
                                        i3 = i2;
                                    } else {
                                        iEnd = -iEnd3;
                                    }
                                }
                                i = 0;
                            }
                            i = 0;
                        } else {
                            i = i3;
                            iEnd = -str.length();
                        }
                        if (iEnd > 0) {
                            return str.substring(iStart, iEnd);
                        }
                        iEnd2 = -iEnd;
                        i3 = i;
                    } else {
                        i = i3;
                    }
                    if (iEnd4 > 0) {
                        iEnd = iEnd4;
                    } else {
                        if (i5 <= 0) {
                            i5 = iEnd3;
                        }
                        iEnd = -i5;
                    }
                    if (iEnd > 0) {
                        return str.substring(iStart, iEnd);
                    }
                    iEnd2 = -iEnd;
                    i3 = i;
                }
            } else {
                iEnd2 = matcher.end();
            }
        }
        return null;
    }

    public static void b(ArrayList arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    i69 i69Var = new i69();
                    i69Var.b = e(strGroup, strArr, matcher);
                    i69Var.c = iStart;
                    i69Var.d = iEnd;
                    arrayList.add(i69Var);
                }
            }
        }
    }

    public static ysi c(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(MediaSessionCompat.KEY_SESSION2_TOKEN);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(mmc.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).a;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final sgg d(fz6 fz6Var, v09 v09Var) {
        return yab.i0(v09Var, null, 0, new af8((Object) v09Var, (Object) new ur8(fz6Var, null, 3), (lq4) null, 4), 3);
    }

    public static String e(String str, String[] strArr, Matcher matcher) {
        boolean z;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            String str3 = str;
            if (str3.regionMatches(true, 0, str2, 0, str2.length())) {
                z = true;
                if (!str3.regionMatches(false, 0, str2, 0, str2.length())) {
                    str = str2.concat(str3.substring(str2.length()));
                    break;
                }
                str = str3;
                break;
            }
            i++;
            str = str3;
        }
        return (z || strArr.length <= 0) ? str : zo5.w(new StringBuilder(), strArr[0], str);
    }

    public static void f(Bundle bundle, ysi ysiVar) {
        if (ysiVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", new ParcelImpl(ysiVar));
        bundle.putParcelable(MediaSessionCompat.KEY_SESSION2_TOKEN, bundle2);
    }
}
