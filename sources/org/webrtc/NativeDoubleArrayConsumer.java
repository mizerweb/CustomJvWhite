package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class NativeDoubleArrayConsumer {
    private final Consumer consumer;

    public interface Consumer {
        void consume(Double[] dArr);
    }

    public NativeDoubleArrayConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public void consume(Double[] dArr) {
        this.consumer.consume(dArr);
    }
}
