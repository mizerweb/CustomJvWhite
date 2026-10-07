package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iwh implements fli {
    public final ejg a;
    public kli b;
    public final boolean c;
    public hwh d;
    public final g8b e = new g8b(0);
    public final boolean f;
    public final int g;
    public final g8b h;
    public i64 i;
    public i64 j;

    public iwh(kg2 kg2Var, ejg ejgVar) {
        this.a = ejgVar;
        this.c = eyl.b(kg2Var);
        boolean z = false;
        ag2 ag2Var = bg2.U;
        bg2 bg2Var = kg2Var.b;
        ag2Var.getClass();
        int i = Build.VERSION.SDK_INT;
        int iIntValue = 1;
        if (i >= 35) {
            Integer num = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
            if (num != null && num.intValue() > 1) {
                z = true;
            }
        }
        this.f = z;
        if (i >= 35) {
            Integer num2 = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
        }
        this.g = iIntValue;
        if (i >= 35) {
        }
        this.h = new g8b(Integer.valueOf(iIntValue));
    }

    public static i64 a(iwh iwhVar, boolean z, int i) {
        return iwhVar.c(z ? 1 : 0, (i & 2) != 0, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    @Override // defpackage.fli
    public final void b(kli kliVar) {
        boolean z;
        this.b = kliVar;
        if (this.d != null) {
            Integer num = (Integer) this.e.d();
            if (num != null) {
                z = num.intValue() == 1;
            }
            a(this, z, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i64 c(int i, boolean z, boolean z2) {
        int i2;
        xf5 xf5VarI;
        ejg ejgVar = this.a;
        if (tvj.f(3, "CXCP")) {
            StringBuilder sb = new StringBuilder("TorchControl#setTorchAsync: torch mode = ");
            sb.append((Object) ("TorchMode(value=" + i + ')'));
            Log.d("CXCP", sb.toString());
        }
        i64 i64Var = new i64();
        if (!z2 && !this.c) {
            i64Var.j0(new IllegalStateException("No flash unit"));
            return i64Var;
        }
        kli kliVar = this.b;
        if (kliVar == null) {
            bc1.p("Camera is not active.", i64Var);
            return i64Var;
        }
        e(i);
        i64 i64Var2 = this.i;
        if (z) {
            if (i64Var2 != null) {
                bc1.p("There is a new enableTorch being set", i64Var2);
            }
            this.i = null;
        } else if (i64Var2 != null) {
            rpl.d(i64Var, i64Var2);
        }
        this.i = i64Var;
        Integer num = i == 0 ? null : 1;
        synchronized (ejgVar.d) {
            ejgVar.k = num;
        }
        ejgVar.f();
        List list = oe.b;
        oe oeVarC = trk.c(ejgVar.e());
        if (oeVarC != null) {
            i2 = oeVarC.a;
        } else {
            if (tvj.f(5, "CXCP")) {
                Log.w("CXCP", "TorchControl#setTorchAsync: Failed to convert ae mode of value " + ejgVar.e() + " with AeMode.fromIntOrNull, fallback to AeMode.ON");
            }
            i2 = 1;
        }
        if (i == 0) {
            xf5VarI = kliVar.i(i2);
        } else {
            if (i == 1) {
                Integer num2 = (Integer) this.h.d();
                if (num2 != null) {
                    f(num2.intValue());
                }
            } else {
                f(this.g);
            }
            xf5VarI = kliVar.f();
        }
        ((up8) xf5VarI).Y(new pt4(xf5VarI, i64Var, new u8h(13)));
        return i64Var;
    }

    public final void e(int i) {
        this.d = new hwh(i);
        int i2 = i != 1 ? 0 : 1;
        boolean zC = wxl.c();
        g8b g8bVar = this.e;
        if (zC) {
            g8bVar.k(Integer.valueOf(i2));
        } else {
            g8bVar.i(Integer.valueOf(i2));
        }
    }

    public final void f(int i) {
        xf5 xf5VarL;
        i64 i64Var = new i64();
        if (Build.VERSION.SDK_INT < 35 || !this.f) {
            i64Var.j0(new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return;
        }
        i64 i64Var2 = this.j;
        if (i64Var2 != null) {
            if (i64Var2 != null) {
                bc1.p("There is a new torch strength being set", i64Var2);
            }
            this.j = null;
        }
        this.j = i64Var;
        i64Var.Y(new ptf(19, this));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(i));
        kli kliVar = this.b;
        if (kliVar == null || (xf5VarL = kliVar.l(linkedHashMap, ili.b)) == null) {
            bc1.p("Camera is not active.", i64Var);
        } else {
            rpl.d(xf5VarL, i64Var);
        }
    }

    @Override // defpackage.fli
    public final void reset() {
        i64 i64Var = this.i;
        if (i64Var != null) {
            bc1.p("There is a new enableTorch being set", i64Var);
        }
        this.i = null;
        i64 i64Var2 = this.j;
        if (i64Var2 != null) {
            bc1.p("There is a new torch strength being set", i64Var2);
        }
        this.j = null;
        if (this.d != null) {
            e(0);
            a(this, false, 6);
            this.d = null;
        }
    }
}
