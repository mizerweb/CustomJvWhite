package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public interface CropAndScaleParamsProvider {

    public static final class CropAndScaleParams {
        private final int cropHeight;
        private final int cropWidth;
        private final int cropX;
        private final int cropY;
        private final int scaleHeight;
        private final int scaleWidth;

        public CropAndScaleParams(int i, int i2, int i3, int i4, int i5, int i6) {
            this.cropX = i;
            this.cropY = i2;
            this.cropWidth = i3;
            this.cropHeight = i4;
            this.scaleWidth = i5;
            this.scaleHeight = i6;
        }

        public int getCropHeight() {
            return this.cropHeight;
        }

        public int getCropWidth() {
            return this.cropWidth;
        }

        public int getCropX() {
            return this.cropX;
        }

        public int getCropY() {
            return this.cropY;
        }

        public int getScaleHeight() {
            return this.scaleHeight;
        }

        public int getScaleWidth() {
            return this.scaleWidth;
        }
    }

    default CropAndScaleParams calculate(int i, int i2, double d) {
        return calculate(i, i2, (int) Math.round(((double) i) / d), (int) Math.round(((double) i2) / d));
    }

    CropAndScaleParams calculate(int i, int i2, int i3, int i4);

    Size calculateAlignment(Size size);
}
