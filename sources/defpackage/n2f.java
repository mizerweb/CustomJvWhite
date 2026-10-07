package defpackage;

import ru.ok.tamtam.messages.scheduled.widget.ScheduledSendPickerBottomSheet;

/* JADX INFO: loaded from: classes3.dex */
public final class n2f extends ib {
    public final int[] c;
    public final /* synthetic */ ScheduledSendPickerBottomSheet d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2f(ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet) {
        super(scheduledSendPickerBottomSheet, 1);
        this.d = scheduledSendPickerBottomSheet;
        this.c = new int[2];
    }

    @Override // defpackage.ib, defpackage.xbd
    public final boolean n(ccd ccdVar, float f, float f2) {
        zv8[] zv8VarArr = ScheduledSendPickerBottomSheet.D;
        g45 g45VarF1 = this.d.F1();
        int[] iArr = this.c;
        g45VarF1.getLocationOnScreen(iArr);
        boolean z = false;
        int i = iArr[0];
        int i2 = iArr[1];
        int width = g45VarF1.getWidth() + i;
        int height = g45VarF1.getHeight() + i2;
        if (f >= i && f <= width && f2 >= i2 && f2 <= height) {
            z = true;
        }
        return !z;
    }
}
