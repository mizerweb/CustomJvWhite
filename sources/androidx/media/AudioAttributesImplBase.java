package androidx.media;

import defpackage.zo5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a;
    public int b;
    public int c;
    public int d;

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i = this.d;
        return i != -1 ? i : AudioAttributesCompat.b(this.c, this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.b == audioAttributesImplBase.b) {
            int i = this.c;
            int i2 = audioAttributesImplBase.c;
            int iA = audioAttributesImplBase.a();
            if (iA == 6) {
                i2 |= 4;
            } else if (iA == 7) {
                i2 |= 1;
            }
            if (i == (i2 & 273) && this.a == audioAttributesImplBase.a && this.d == audioAttributesImplBase.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d)});
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.a;
        int i2 = AudioAttributesCompat.b;
        switch (i) {
            case 0:
                strH = "USAGE_UNKNOWN";
                break;
            case 1:
                strH = "USAGE_MEDIA";
                break;
            case 2:
                strH = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strH = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strH = "USAGE_ALARM";
                break;
            case 5:
                strH = "USAGE_NOTIFICATION";
                break;
            case 6:
                strH = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strH = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strH = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strH = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strH = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strH = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strH = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strH = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strH = "USAGE_GAME";
                break;
            case 15:
            default:
                strH = zo5.h(i, "unknown usage ");
                break;
            case 16:
                strH = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strH);
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
