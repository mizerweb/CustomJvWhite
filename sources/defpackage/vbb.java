package defpackage;

import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class vbb {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[SessionDescription.Type.values().length];
        try {
            iArr[SessionDescription.Type.OFFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SessionDescription.Type.PRANSWER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SessionDescription.Type.ANSWER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SessionDescription.Type.ROLLBACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[wbb.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[3] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[1] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[7] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[8] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[9] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
