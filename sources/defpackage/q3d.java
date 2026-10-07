package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class q3d implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ s3d a;

    public q3d(s3d s3dVar) {
        this.a = s3dVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        s3d s3dVar = this.a;
        yd1 yd1Var = s3dVar.f;
        if (!z || !s3dVar.h) {
            yd1Var.setVisibility(8);
            return;
        }
        r3d r3dVar = s3dVar.i;
        if (r3dVar != null) {
            ((td8) r3dVar).l.a(new rr4(i));
        }
        ((TextView) yd1Var.c).setText(mxl.a(i));
        g4d g4dVar = s3dVar.e;
        yd1Var.setTranslationX(Math.min((g4dVar.getWidth() - s3dVar.d.getWidth()) - yd1Var.getWidth(), Math.max(s3dVar.c.getWidth(), (g4dVar.getThumbOffset() + (s3dVar.getPaddingLeft() + g4dVar.getThumb().getBounds().centerX())) - (yd1Var.getWidth() / 2.0f))));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        r3d listener = this.a.getListener();
        if (listener != null) {
            ((td8) listener).l.a(tr4.a);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        s3d s3dVar = this.a;
        r3d listener = s3dVar.getListener();
        if (listener != null) {
            ((td8) listener).l.a(new ur4(seekBar.getProgress()));
        }
        s3dVar.f.setVisibility(8);
    }
}
