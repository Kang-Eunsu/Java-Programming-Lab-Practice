# 0. Requiremetns
- python 3.8.5
- Ubuntu 18.04LTS
- pytorch 1.7.1
- opencv-python 4.5.1.48
- torchvision 0.8.2
- numpy 1.19.2
- matplotlib 3.3.4
- xml
- pillow 8.1.0
- albumentations 0.5.2
- tqdm 4.60.0

# 1. Model pth file
- 모델 pth가 저장되는 경로는 train.py 안에 pth_path로 지정하였음.
- 학습에는 train set만 이용함.
- 'epoch' : epoch 수
- 'model_state_dict' : 학습된 모델 상태(weights)
- 'optimizer_state_dict' : optimizer(SGD) 상태

# 2. Data
- Torchvision을 통해 해당 데이터셋을 다운로드 받음.
- train.py 안에 data_path가 '../data'로 지정되어있음 따라서 해당 train.py가 있는 폴더의 상위 폴더에 data 폴더를 미리 생성하고 해당 코드를 진행함. 

# 3. Eval.py
- eval.py 안의 show_result 함수로 한 이미지를 inference하고 해당 결과를 시각적으로 볼 수 있음.
- show_result의 parameter 중 index를 이용하여 dataset에 접근함. 
- 터미널에서 사진이 안 떠 본인은 vscode의 #%% 구문을 추가하여 jupyter extension에서 사진들을 확인하였음.
- eval.py 안의 test 함수로 validation set을 이용한 mAP 값을 추출해냄.

# 4. Model의 detect_objects 함수
- 모델을 통해 추출되는 것은 지정한 8578개의 모든 bounding box와 해당 class에 대한 confidence가 나오게 됨.
- detect_objects 함수의 parameter로는 min_score, 사용할 bounding box의 minimum confidence / max_overlap, 두 개의 bounding box가 가질 수 있는 maximum overlapping / top_k, min_score을 통해 추출된 bounding box들이 top_k 수보다 많을 경우 상위(confidence 기준) top_k개의 bounding boxes만 필터링 가 있음.
- 실제 bounding box 좌표를 구하기 위해선 detect_objects 함수를 통해 도출된 box에 original dim인 (300,300,300,300)을 곱해줘야 한다. 이는 eval.py의 show_result 함수에서 확인할 수 있다.
- detected class는 0-19 사이의 id로 나오는데 class list에 접근하기 위해 int로 형태를 바꿔줘야 한다.

# 5. Learning time
- 100 epoch 당 약 3시간 30분 소요됨.

# 6. Train Command
- python 2019312406_강은수_train.py

# 7. Eval Command
- python 2019312406_강은수_eval.py
