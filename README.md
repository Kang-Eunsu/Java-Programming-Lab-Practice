# 1. Model pth file
- 모델 pth가 저장되는 경로는 train.py 안에 pth_path로 지정하였음.
- 학습에는 train set만 이용함.
- 'epoch' : epoch 수
- 'model_state_dict' : 학습된 모델 상태(weights)
- 'optimizer_state_dict' : optimizer(SGD) 상태

# 2. Data
Torchvision을 통해 해당 데이터셋을 다운로드 받음.
train.py 안에 data_path가 '../data'로 지정되어있음 따라서 해당 train.py가 있는 폴더의 상위 폴더에 data 폴더를 생성하고 해당 코드를 진행함. 

# 3. Eval.py
eval.py 안의 show_result 함수로 한 이미지를 inference하고 해당 결과를 시각적으로 볼 수 있음.
show_result의 parameter 중 index를 이용하여 dataset에 접근함. 
터미널에서 사진이 안 떠 본인은 vscode의 #%% 구문을 추가하여 jupyter extension에서 사진들을 확인하였음.
eval.py 안의 test 함수로 validation set을 이용한 mAP 값을 추출해냄.

