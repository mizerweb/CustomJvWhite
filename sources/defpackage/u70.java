package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u70 {
    public static final u70 c = new u70(c98.r(t70.d));
    public static final ghe d;
    public static final g98 e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        ch3.e(objArr, 3);
        d = c98.j(objArr, 3);
        hle hleVar = new hle(4);
        hleVar.j(5, 6);
        hleVar.j(17, 6);
        hleVar.j(7, 6);
        hleVar.j(30, 10);
        hleVar.j(18, 6);
        hleVar.j(6, 8);
        hleVar.j(8, 8);
        hleVar.j(14, 8);
        e = hleVar.c(true);
    }

    public u70(ghe gheVar) {
        for (int i = 0; i < gheVar.d; i++) {
            t70 t70Var = (t70) gheVar.get(i);
            this.a.put(t70Var.a, t70Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((t70) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
    }

    public static ghe a(int i, int[] iArr) {
        z88 z88VarL = c98.l();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            z88VarL.c(new t70(i2, i));
        }
        return z88VarL.h();
    }

    public static u70 b(Context context, p70 p70Var, AudioDeviceInfo audioDeviceInfo) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), p70Var, audioDeviceInfo);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    public static u70 c(Context context, Intent intent, p70 p70Var, AudioDeviceInfo audioDeviceInfo) {
        AudioManager audioManagerQ = p90.q(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? kwk.c(audioManagerQ, p70Var) : null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (vqi.T(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return kwk.a(audioManagerQ, p70Var);
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? audioManagerQ.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        t98 t98Var = new t98();
        t98Var.e(8, 7);
        if (i >= 31) {
            t98Var.e(26, 27);
        }
        if (i >= 33) {
            t98Var.h(30);
        }
        u98 u98VarJ = t98Var.j();
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (u98VarJ.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                return c;
            }
        }
        t98 t98Var2 = new t98();
        t98Var2.h(2);
        if (Build.VERSION.SDK_INT >= 29 && (vqi.T(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            t98Var2.i(hwk.a(p70Var));
            return new u70(a(10, k4m.h(t98Var2.j())));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    t98Var2.i(d);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            t98Var2.i(d);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new u70(a(10, k4m.h(t98Var2.j())));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            t98Var2.i(k4m.a(intArrayExtra));
        }
        return new u70(a(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), k4m.h(t98Var2.j())));
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    public final Pair d(b87 b87Var, p70 p70Var) {
        String str = b87Var.n;
        str.getClass();
        int iC = uya.c(str, b87Var.k);
        Integer numValueOf = Integer.valueOf(iC);
        g98 g98Var = e;
        if (!g98Var.containsKey(numValueOf)) {
            return null;
        }
        int i = 6;
        SparseArray sparseArray = this.a;
        if (iC == 18 && !vqi.l(sparseArray, 18)) {
            iC = 6;
        } else if ((iC == 8 && !vqi.l(sparseArray, 8)) || (iC == 30 && !vqi.l(sparseArray, 30))) {
            iC = 7;
        }
        if (!vqi.l(sparseArray, iC)) {
            return null;
        }
        t70 t70Var = (t70) sparseArray.get(iC);
        t70Var.getClass();
        int iIntValue = t70Var.b;
        u98 u98Var = t70Var.c;
        int i2 = b87Var.F;
        boolean zContains = false;
        if (i2 == -1 || iC == 18) {
            int i3 = b87Var.G;
            if (i3 == -1) {
                i3 = 48000;
            }
            int i4 = t70Var.a;
            if (u98Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    iIntValue = hwk.b(i4, i3, p70Var);
                } else {
                    Object obj = g98Var.get(Integer.valueOf(i4));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i2 = iIntValue;
        } else if (!b87Var.n.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (u98Var != null) {
                int iU = vqi.u(i2);
                if (iU != 0) {
                    zContains = u98Var.contains(Integer.valueOf(iU));
                }
            } else if (i2 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i2 > 10) {
            return null;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28) {
            i = i2;
        } else if (i2 == 7) {
            i = 8;
        } else if (i2 != 3 && i2 != 4 && i2 != 5) {
            i = i2;
        }
        if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iU2 = vqi.u(i);
        if (iU2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iC), Integer.valueOf(iU2));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof u70) {
                u70 u70Var = (u70) obj;
                SparseArray sparseArray = u70Var.a;
                String str = vqi.a;
                SparseArray sparseArray2 = this.a;
                if (sparseArray2 == null) {
                    if (sparseArray == null) {
                        zContentEquals = true;
                    } else {
                        zContentEquals = false;
                    }
                } else if (sparseArray == null) {
                    zContentEquals = false;
                } else if (Build.VERSION.SDK_INT >= 31) {
                    zContentEquals = sparseArray2.contentEquals(sparseArray);
                } else {
                    int size = sparseArray2.size();
                    if (size == sparseArray.size()) {
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                if (Objects.equals(sparseArray2.valueAt(i), sparseArray.get(sparseArray2.keyAt(i)))) {
                                    i++;
                                }
                            } else {
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                }
                if (!zContentEquals || this.b != u70Var.b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        String str = vqi.a;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.a;
        if (i >= 31) {
            iHashCode = sparseArray.contentHashCode();
        } else {
            iHashCode = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
            }
        }
        return (iHashCode * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }
}
