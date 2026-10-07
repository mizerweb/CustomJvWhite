package org.webrtc.audio;

import defpackage.c0a;
import defpackage.qt4;
import defpackage.qv1;
import java.nio.ByteBuffer;
import org.webrtc.Logging;

/* JADX INFO: loaded from: classes3.dex */
class WebRtcSilenceProvider {
    private static final String TAG = "WebRtcSilenceProvider";
    private final int audioFormat;
    private final long bufferDurationNs;
    private final int channelCount;
    private long lastReadTimeNs;
    private final int sampleRate;
    private final byte[] silenceBytes;
    private final Statistics statistics = new Statistics(0);

    public WebRtcSilenceProvider(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.sampleRate = i2;
        this.audioFormat = i;
        this.channelCount = i3;
        long j = (((long) i4) * 1000000000) / ((long) i2);
        this.bufferDurationNs = j;
        if (bArr == null || i5 != bArr.length) {
            bArr = new byte[i5 < 0 ? 0 : i5];
        }
        this.silenceBytes = bArr;
        int length = bArr.length;
        StringBuilder sbP = qv1.p("Silence provider initialized, sampleRate=", i2, ", framesPerBuffer=", i4, ", bufferDuration=");
        sbP.append(j / 1000000);
        sbP.append("ms, bufferCapacity=");
        sbP.append(length);
        Logging.d(TAG, sbP.toString());
    }

    public int getAudioFormat() {
        return this.audioFormat;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int read(ByteBuffer byteBuffer, int i) {
        int iMin = Math.min(i, byteBuffer.capacity());
        int i2 = 0;
        while (i2 < iMin) {
            int iMin2 = Math.min(byteBuffer.remaining(), this.silenceBytes.length);
            if (iMin2 == 0) {
                break;
            }
            byteBuffer.put(this.silenceBytes, byteBuffer.position(), iMin2);
            i2 += iMin2;
        }
        long jNanoTime = System.nanoTime();
        long j = (this.bufferDurationNs - (jNanoTime - this.lastReadTimeNs)) / 1000000;
        if (j > 0) {
            try {
                Thread.sleep(j);
            } catch (InterruptedException unused) {
                Logging.d(TAG, "Interrupted while waiting for frame duration, return immediately");
            }
        }
        long jNanoTime2 = System.nanoTime();
        this.lastReadTimeNs = jNanoTime2;
        this.statistics.trackRead(jNanoTime, jNanoTime2, j);
        return i2;
    }

    public static class Statistics {
        private static final long LOG_INTERVAL = 15000000000L;
        private long lastLogTimeNs;
        private int readCount;
        private long totalReadTimeNs;
        private long totalSleepTimeMs;

        public /* synthetic */ Statistics(int i) {
            this();
        }

        private void reset() {
            this.totalSleepTimeMs = 0L;
            this.totalReadTimeNs = 0L;
            this.readCount = 0;
        }

        public void trackRead(long j, long j2, long j3) {
            int i = this.readCount + 1;
            this.readCount = i;
            if (j3 > 0) {
                this.totalSleepTimeMs += j3;
            }
            long j4 = (j2 - j) + this.totalReadTimeNs;
            this.totalReadTimeNs = j4;
            long j5 = j2 - this.lastLogTimeNs;
            long j6 = LOG_INTERVAL;
            if (j5 > j6) {
                long j7 = this.totalSleepTimeMs / ((long) i);
                this.lastLogTimeNs = j2;
                StringBuilder sbS = qt4.s(j6, "Log interval: ", "ns, log delta: ");
                c0a.w(sbS, j5, "ns, reads: ", i);
                qt4.z((j4 / ((long) i)) / 1000000, ", read time: ", "ms, suspend time: ", sbS);
                sbS.append(j7);
                sbS.append("ms");
                Logging.d(WebRtcSilenceProvider.TAG, sbS.toString());
                reset();
            }
        }

        private Statistics() {
        }
    }
}
