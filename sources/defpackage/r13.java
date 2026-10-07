package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class r13 {
    public final cea a;
    public final ny8 b = rx8.P(3, new k82(12));

    public r13(cea ceaVar) {
        this.a = ceaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        if (r3 == r11) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(defpackage.rt2 r18, defpackage.fda r19, defpackage.nq4 r20) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r13.a(rt2, fda, nq4):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(rt2 rt2Var, fda fdaVar, x7a x7aVar, nq4 nq4Var) {
        q13 q13Var;
        tnh tnhVar;
        ynh tnhVar2;
        ynh ynhVar;
        tnh tnhVar3;
        if (nq4Var instanceof q13) {
            q13Var = (q13) nq4Var;
            int i = q13Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                q13Var.i = i - Integer.MIN_VALUE;
            } else {
                q13Var = new q13(this, nq4Var);
            }
        } else {
            q13Var = new q13(this, nq4Var);
        }
        Object obj = q13Var.g;
        int i2 = q13Var.i;
        if (i2 == 0) {
            ch3.d0(obj);
            boolean z = x7aVar instanceof t7a;
            if (z) {
                tnhVar = new tnh(R.string.profile_media_confirmation_delete_file_title);
            } else if (x7aVar instanceof u7a) {
                tnhVar = new tnh(R.string.profile_media_confirmation_delete_link_title);
            } else if (x7aVar instanceof v7a) {
                tnhVar = new tnh(R.string.profile_media_confirmation_delete_media_title);
            } else {
                if (!(x7aVar instanceof s7a) && !(x7aVar instanceof w7a)) {
                    ore.o();
                    return null;
                }
                tnhVar = new tnh(R.string.profile_media_confirmation_delete_audio_title);
            }
            if (z) {
                tnhVar2 = new vnh(R.string.profile_media_confirmation_delete_file_description, a.n1(Arrays.copyOf(new Object[]{((t7a) x7aVar).e}, 1)));
            } else if (x7aVar instanceof u7a) {
                tnhVar2 = new tnh(R.string.profile_media_confirmation_delete_link_description);
            } else if (x7aVar instanceof v7a) {
                tnhVar2 = new tnh(R.string.profile_media_confirmation_delete_media_description);
            } else {
                if (!(x7aVar instanceof s7a) && !(x7aVar instanceof w7a)) {
                    ore.o();
                    return null;
                }
                tnhVar2 = new tnh(R.string.profile_media_confirmation_delete_audio_description);
            }
            q13Var.d = x7aVar;
            q13Var.e = tnhVar;
            q13Var.f = tnhVar2;
            q13Var.i = 1;
            Serializable serializableA = a(rt2Var, fdaVar, q13Var);
            Serializable serializable = hu4.a;
            if (serializableA == serializable) {
                return serializable;
            }
            ynh ynhVar2 = tnhVar2;
            obj = serializableA;
            ynhVar = ynhVar2;
            tnhVar3 = tnhVar;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ynhVar = q13Var.f;
            tnhVar3 = q13Var.e;
            x7aVar = q13Var.d;
            ch3.d0(obj);
        }
        return new p33(x7aVar, tnhVar3, ynhVar, (List) obj);
    }
}
