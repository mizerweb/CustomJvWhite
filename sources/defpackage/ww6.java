package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class ww6 implements vx0, vj, px5 {
    public static final ww6 c = new ww6(0, 1, (byte) 0);
    public static final ww6 d = new ww6(1, 1, (byte) 0);
    public static final ww6 e = new ww6(0, 2, (byte) 0);
    public static final ww6 f = new ww6(1, 2, (byte) 0);
    public static final ww6 g = new ww6(2, 2, (byte) 0);
    public final /* synthetic */ int a;
    public int b;

    public ww6(NotificationChannel notificationChannel) {
        this.a = 13;
        String id = notificationChannel.getId();
        int importance = notificationChannel.getImportance();
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        id.getClass();
        this.b = importance;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        notificationChannel.getName();
        notificationChannel.getDescription();
        notificationChannel.getGroup();
        notificationChannel.canShowBadge();
        notificationChannel.getSound();
        notificationChannel.getAudioAttributes();
        notificationChannel.shouldShowLights();
        notificationChannel.getLightColor();
        notificationChannel.shouldVibrate();
        notificationChannel.getVibrationPattern();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            iq4.e(notificationChannel);
            iq4.d(notificationChannel);
        }
        notificationChannel.canBypassDnd();
        notificationChannel.getLockscreenVisibility();
        if (i >= 29) {
            io.a(notificationChannel);
        }
        if (i >= 30) {
            iq4.f(notificationChannel);
        }
    }

    @Override // defpackage.px5
    public int a(Context context, String str, boolean z) {
        return 0;
    }

    @Override // defpackage.vx0
    public void b() {
    }

    @Override // defpackage.vx0
    public au3 c(int i, int i2, int i3) {
        return null;
    }

    public Object clone() {
        switch (this.a) {
            case 14:
                ww6 ww6Var = new ww6();
                ww6Var.b = this.b;
                return ww6Var;
            default:
                return super.clone();
        }
    }

    @Override // defpackage.vx0
    public void d() {
    }

    @Override // defpackage.vx0
    public void e(g85 g85Var, ux0 ux0Var, px0 px0Var, int i) {
        g85 g85Var2;
        ux0 ux0Var2;
        px0 px0Var2;
        int i2 = this.b;
        int i3 = 1;
        if (1 > i2) {
            return;
        }
        while (true) {
            int iV = (i + i3) % px0Var.c.v();
            if (pj6.a.h(2)) {
                pj6.e(ww6.class, "Preparing frame %d, last drawn: %d", Integer.valueOf(iV), Integer.valueOf(i));
            }
            int iHashCode = (px0Var.hashCode() * 31) + iV;
            synchronized (((SparseArray) g85Var.e)) {
                if (((SparseArray) g85Var.e).get(iHashCode) != null) {
                    pj6.d(g85.class, Integer.valueOf(iV), "Already scheduled decode job for frame %d");
                } else if (ux0Var.o(iV)) {
                    pj6.d(g85.class, Integer.valueOf(iV), "Frame %d is cached already.");
                } else {
                    g85Var2 = g85Var;
                    ux0Var2 = ux0Var;
                    px0Var2 = px0Var;
                    f85 f85Var = new f85(g85Var2, px0Var2, ux0Var2, iV, iHashCode);
                    ((SparseArray) g85Var2.e).put(iHashCode, f85Var);
                    ((ExecutorService) g85Var2.d).execute(f85Var);
                }
                g85Var2 = g85Var;
                ux0Var2 = ux0Var;
                px0Var2 = px0Var;
            }
            if (i3 == i2) {
                return;
            }
            i3++;
            g85Var = g85Var2;
            px0Var = px0Var2;
            ux0Var = ux0Var2;
        }
    }

    @Override // defpackage.px5
    public int f(Context context, String str) {
        return this.b;
    }

    @Override // defpackage.vj
    public int g() {
        int i = 1 - this.b;
        this.b = i;
        return i;
    }

    @Override // defpackage.vx0
    public void h(int i, int i2) {
    }

    public rfa i(rfa rfaVar) {
        int iLastIndexOf;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str = rfaVar.g;
        int i = this.b;
        Pattern pattern = xoh.a;
        ArrayList arrayList3 = new ArrayList();
        if (str.length() < i) {
            arrayList3.add(str);
        } else {
            int i2 = 300;
            if (300 > i) {
                ore.p("deltaForNewLineSeparator should be less then maxLength");
                return null;
            }
            if (50 > i) {
                ore.p("deltaForSpaceSeparator should be less then maxLength");
                return null;
            }
            String strSubstring = str.substring(i - 300, i);
            String[] strArr = xoh.j;
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    iLastIndexOf = -1;
                    break;
                }
                iLastIndexOf = strSubstring.lastIndexOf(strArr[i3]);
                if (iLastIndexOf > -1) {
                    break;
                }
                i3++;
            }
            if (iLastIndexOf == -1) {
                String strSubstring2 = str.substring(i - 50, i);
                String[] strArr2 = xoh.k;
                int length2 = strArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        iLastIndexOf = -1;
                        break;
                    }
                    int iLastIndexOf2 = strSubstring2.lastIndexOf(strArr2[i4]);
                    if (iLastIndexOf2 > -1) {
                        iLastIndexOf = iLastIndexOf2;
                        break;
                    }
                    i4++;
                }
                i2 = 50;
            }
            if (iLastIndexOf == -1) {
                arrayList3.add(str.substring(0, i));
                arrayList3.add(str.substring(i));
            } else {
                int length3 = str.substring(0, i - i2).length() + iLastIndexOf;
                arrayList3.add(str.substring(0, length3));
                arrayList3.add(str.substring(length3 + 1));
            }
        }
        if (arrayList3.size() != 2) {
            gm0.s("ww6", "Wrong message split! Size is %d", Integer.valueOf(arrayList3.size()));
            return null;
        }
        String string = r5h.y1((String) arrayList3.get(0)).toString();
        String string2 = r5h.y1((String) arrayList3.get(1)).toString();
        rfaVar.g = string;
        rfaVar.u = false;
        List<cga> list = rfaVar.D;
        if (list != null) {
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            int length4 = str.length() - (string2.length() + string.length());
            for (cga cgaVar : list) {
                int i5 = cgaVar.d;
                int i6 = cgaVar.e;
                if (i5 > string.length()) {
                    arrayList2.add(cga.a(cgaVar, (i5 - string.length()) - length4, 0, 55).b());
                } else if (i5 + i6 > string.length()) {
                    int length5 = string.length() - i5;
                    arrayList.add(cga.a(cgaVar, 0, length5, 47).b());
                    arrayList2.add(cga.a(cgaVar, 0, (i6 - length4) - length5, 39).b());
                } else {
                    arrayList.add(cgaVar.b());
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        rfaVar.D = arrayList != null ? ww3.o1(arrayList) : null;
        rfa rfaVar2 = new rfa();
        rfaVar2.g = string2;
        rfaVar2.D = arrayList2 != null ? ww3.o1(arrayList2) : null;
        rfaVar2.q = rfaVar.q;
        rfaVar2.u = rfaVar.u;
        rfaVar2.F = rfaVar.F;
        return rfaVar2;
    }

    public void j(jlb jlbVar) {
        Bundle bundle = new Bundle();
        int i = this.b;
        if (i != 1) {
            bundle.putInt("flags", i);
        }
        jlbVar.e.putBundle("android.wearable.EXTENSIONS", bundle);
    }

    public int k(int i) {
        int i2 = this.b;
        int i3 = i % i2;
        Integer numValueOf = Integer.valueOf(i3);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3 + i2;
    }

    public int l() {
        return this.b;
    }

    public void m() {
        this.b |= 4;
    }

    public void n() {
        this.b |= 2;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return c0a.k(this.b, "{value=", "}");
            case 10:
                return String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.b)}, 1));
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ww6(int i, int i2, byte b) {
        this.a = i2;
        this.b = i;
    }

    public ww6(int i, int i2, int i3, int i4, int i5) {
        int i6;
        this.a = 16;
        int iD = qt4.D(i5);
        int i7 = 0;
        if (iD == 0) {
            i6 = 1;
        } else if (iD == 1) {
            i6 = 2;
        } else {
            if (iD != 2) {
                ore.o();
                throw null;
            }
            i6 = 0;
        }
        if (i == 3 && i2 == 2 && i4 == 1 && ((i5 == 1 || i5 == 2) && i3 == 1)) {
            i7 = i6;
        }
        this.b = i7;
    }

    public ww6(int i, int i2) {
        this.a = 7;
        this.b = i;
    }

    public ww6(int i, int i2, int i3, int i4) {
        int i5;
        this.a = 4;
        int iD = qt4.D(i4);
        int i6 = 0;
        if (iD == 0) {
            i5 = 1;
        } else if (iD == 1) {
            i5 = 2;
        } else {
            if (iD != 2) {
                ore.o();
                throw null;
            }
            i5 = 0;
        }
        if (i == 2 && i3 == 1 && ((i4 == 1 || i4 == 2) && i2 == 1)) {
            i6 = i5;
        }
        this.b = i6;
    }

    public /* synthetic */ ww6(int i) {
        this.a = i;
    }

    public ww6() {
        this.a = 14;
        this.b = 1;
    }
}
