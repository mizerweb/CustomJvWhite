package defpackage;

import android.media.VolumeProvider;

/* JADX INFO: loaded from: classes4.dex */
public final class zaj extends VolumeProvider {
    public final /* synthetic */ k3a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaj(k3a k3aVar, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = k3aVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        k3a k3aVar = this.a;
        vqi.d0(k3aVar.f, new j3a(k3aVar.g, i, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        k3a k3aVar = this.a;
        vqi.d0(k3aVar.f, new j3a(k3aVar.g, i, 0));
    }
}
