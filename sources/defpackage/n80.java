package defpackage;

import android.media.AudioManager;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n80 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n80(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        p70 p70Var;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                p80 p80Var = (p80) obj;
                p80Var.getClass();
                if (i == -3 || i == -2) {
                    if (i != -2 && ((p70Var = p80Var.d) == null || p70Var.a != 1)) {
                        p80Var.b(4);
                    } else {
                        kg6 kg6Var = p80Var.c;
                        if (kg6Var != null) {
                            kg6Var.h.b(33, 0, 0).b();
                        }
                        p80Var.b(3);
                    }
                } else if (i == -1) {
                    kg6 kg6Var2 = p80Var.c;
                    if (kg6Var2 != null) {
                        kg6Var2.h.b(33, -1, 0).b();
                    }
                    p80Var.a();
                    p80Var.b(1);
                } else if (i == 1) {
                    p80Var.b(2);
                    kg6 kg6Var3 = p80Var.c;
                    if (kg6Var3 != null) {
                        kg6Var3.h.b(33, 1, 0).b();
                    }
                } else {
                    qt4.y(i, "Unknown focus change type: ", "AudioFocusManager");
                }
                break;
            case 1:
                AudioFocusRequestHelper.requestFocus$lambda$0((AudioFocusRequestHelper) obj, i);
                break;
            default:
                jce jceVar = (jce) obj;
                if ((i == -3 || i == -2 || i == -1) && (((dce) jceVar.r.getValue()) instanceof bce)) {
                    jceVar.E();
                }
                break;
        }
    }
}
