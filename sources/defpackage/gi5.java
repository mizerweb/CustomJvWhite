package defpackage;

import android.content.Context;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class gi5 extends wod {
    public final b9b u;

    public gi5(Context context) {
        ei5 ei5Var = new ei5(context);
        super(ei5Var);
        long[] jArr = q1f.a;
        this.u = new b9b();
        ei5Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ei5Var.j.setOnEditorActionListener(new fi5(0));
        ei5Var.setMinLines(3);
        ei5Var.setShowLengthLimitWhileFocused(true);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        ai5 ai5Var = (ai5) k79Var;
        ei5 ei5Var = (ei5) this.a;
        ei5Var.setMaxCount(ai5Var.c);
        ei5Var.setText(ai5Var.a);
        ei5Var.setHint(ai5Var.b);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004a A[LOOP:0: B:5:0x000f->B:15:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x004d A[EDGE_INSN: B:19:0x004d->B:16:0x004d BREAK  A[LOOP:0: B:5:0x000f->B:15:0x004a], SYNTHETIC] */
    @Override // defpackage.s7g
    public final void G() {
        b9b b9bVar = this.u;
        Object[] objArr = b9bVar.b;
        Object[] objArr2 = b9bVar.c;
        long[] jArr = b9bVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            ((bi5) objArr2[i4]).a();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        b9bVar.g();
    }
}
