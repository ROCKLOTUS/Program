#!/usr/bin/env python3.5
# coding=utf-8
import cv2

img = cv2.imread(r'/home/rock/Pictures/Girl1.jpg',cv2.IMREAD_COLOR)
cv2.imshow('GIRL1',img)
k = cv2.waitKey(1000*10)

if k == 27:
    cv2.destroyAllWindows()
elif k == ord('s'):
    cv2.imwrite('girlCopy.jpg',img)
    cv2.destroyAllWindows()
else:
    cv2.destroyAllWindows()

