package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ac0 implements yb0 {
    public AudioRecord a;
    public final rg0 b;
    public final int f;
    public final int g;
    public rj5 h;
    public eif i;
    public long j;
    public zb0 k;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicReference e = new AtomicReference(null);
    public boolean l = false;

    public ac0(rg0 rg0Var, Context context) throws AudioStream$AudioStreamException {
        int i = rg0Var.b;
        int i2 = rg0Var.d;
        int i3 = rg0Var.e;
        if (i > 0 && i2 > 0) {
            if (AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, i3) > 0) {
                try {
                    new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2 == 1 ? 16 : 12).setEncoding(i3).build();
                    this.b = rg0Var;
                    this.g = rg0Var.a();
                    int minBufferSize = AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, i3);
                    qyj.l(null, minBufferSize > 0);
                    int i4 = minBufferSize * 2;
                    this.f = i4;
                    AudioRecord audioRecordB = b(i4, rg0Var, context);
                    this.a = audioRecordB;
                    if (audioRecordB.getState() == 1) {
                        return;
                    }
                    audioRecordB.release();
                    throw new AudioStream$AudioStreamException("Unable to initialize AudioRecord");
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static AudioRecord b(int i, rg0 rg0Var, Context context) {
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(rg0Var.b).setChannelMask(rg0Var.d == 1 ? 16 : 12).setEncoding(rg0Var.e).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (Build.VERSION.SDK_INT >= 31 && context != null) {
            jo.d(builder, context);
        }
        builder.setAudioSource(rg0Var.a);
        builder.setAudioFormat(audioFormatBuild);
        builder.setBufferSizeInBytes(i);
        try {
            return builder.build();
        } catch (UnsupportedOperationException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void a() {
        qyj.l("AudioStream has been released.", !this.c.get());
    }

    public final void c(boolean z) {
        eif eifVar = this.i;
        rj5 rj5Var = this.h;
        if (eifVar == null || rj5Var == null || Objects.equals(this.e.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        eifVar.execute(new nb0(rj5Var, z, 2));
    }

    public final void d() throws AudioStream$AudioStreamException {
        a();
        AtomicBoolean atomicBoolean = this.d;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        if (sk5.a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            AudioRecord audioRecord = this.a;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new AudioStream$AudioStreamException("Unable to initialize AudioRecord");
            }
        }
        this.a.startRecording();
        boolean z = false;
        if (this.a.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new AudioStream$AudioStreamException("Unable to start AudioRecord with state: " + this.a.getRecordingState());
        }
        this.j = 0L;
        this.l = false;
        this.e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration audioRecordingConfigurationC = io.c(this.a);
            z = audioRecordingConfigurationC != null && io.f(audioRecordingConfigurationC);
        }
        c(z);
    }

    @Override // defpackage.yb0
    public final tg0 read(ByteBuffer byteBuffer) {
        a();
        qyj.l("AudioStream has not been started.", this.d.get());
        int i = this.a.read(byteBuffer, this.f);
        long jNanoTime = 0;
        if (i > 0) {
            byteBuffer.limit(i);
            if (this.l) {
                jNanoTime = -1;
            } else {
                AudioTimestamp audioTimestamp = new AudioTimestamp();
                if (this.a.getTimestamp(audioTimestamp, 0) == 0) {
                    int i2 = this.b.b;
                    long j = this.j;
                    qyj.h("sampleRate must be greater than 0.", ((long) i2) > 0);
                    qyj.h("framePosition must be no less than 0.", j >= 0);
                    long jA = audioTimestamp.nanoTime + wwk.a(i2, j - audioTimestamp.framePosition);
                    jNanoTime = jA >= 0 ? jA : 0L;
                    if (Math.abs(jNanoTime - System.nanoTime()) > 500000000) {
                        this.l = true;
                    }
                } else {
                    tvj.g("AudioStreamImpl", "Unable to get audio timestamp");
                }
                jNanoTime = -1;
            }
            if (jNanoTime == -1) {
                jNanoTime = System.nanoTime();
            }
            this.j = wwk.c(this.g, i) + this.j;
        }
        return new tg0(i, jNanoTime);
    }
}
