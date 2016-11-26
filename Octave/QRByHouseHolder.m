function [Q,R] = QRByHouseHolder(A)
%this function is the QR-Decomposition for Matrix A
%
%
format rat;
B = A;
[m,n] = size(B);
Q = eye(m);

for i = 1:n-1;
    H = HouseHolder(B);
    B = H*B;
    B = B(2:end,2:end);
    H1 = [eye(m,i-1),[zeros(i-1,n-i+1);H]];
    Q = H1 * Q;
end 
format short;
R = Q*A;
Q = inv(Q);
end

function H = HouseHolder(B)
    u1 = B(:,1);
    if u1(1) == 0
        u = norm(u1);
    else
        u = norm(u1)*u1(1)/abs(u1(1));
    end
    u1 = u1 + u*eye(size(u1));
    u1 = u1/norm(u1);
    
    H = eye(length(u1))-2*u1*u1';
end
