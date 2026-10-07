package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.bluetooth.BluetoothProfile;
import defpackage.af7;
import defpackage.sbi;
import defpackage.ux8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsbi;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CallsBluetoothManager$BluetoothServiceListener$onServiceConnected$2 extends ux8 implements af7 {
    final /* synthetic */ int $profile;
    final /* synthetic */ BluetoothProfile $proxy;
    final /* synthetic */ CallsBluetoothManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallsBluetoothManager$BluetoothServiceListener$onServiceConnected$2(CallsBluetoothManager callsBluetoothManager, int i, BluetoothProfile bluetoothProfile) {
        super(0);
        this.this$0 = callsBluetoothManager;
        this.$profile = i;
        this.$proxy = bluetoothProfile;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m110invoke() {
        this.this$0.onServiceConnectedImpl(this.$profile, this.$proxy);
    }

    @Override // defpackage.af7
    public /* bridge */ /* synthetic */ Object invoke() {
        m110invoke();
        return sbi.a;
    }
}
