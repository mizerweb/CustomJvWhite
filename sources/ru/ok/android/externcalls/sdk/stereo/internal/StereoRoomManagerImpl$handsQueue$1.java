package ru.ok.android.externcalls.sdk.stereo.internal;

import defpackage.af7;
import defpackage.fg7;
import defpackage.qf7;
import defpackage.sbi;
import defpackage.yt1;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class StereoRoomManagerImpl$handsQueue$1 extends fg7 implements qf7 {
    public StereoRoomManagerImpl$handsQueue$1(Object obj) {
        super(2, 0, StereoRoomManagerImpl.class, obj, "resolveIdsAndThen", "resolveIdsAndThen(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V");
    }

    @Override // defpackage.qf7
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((List<yt1>) obj, (af7) obj2);
        return sbi.a;
    }

    public final void invoke(List<yt1> list, af7 af7Var) {
        ((StereoRoomManagerImpl) this.receiver).resolveIdsAndThen(list, af7Var);
    }
}
